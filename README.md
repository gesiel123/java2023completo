#Como configurar o Eclipse para trabalho com o repositório GitHub
  Parte 1 - Configurar o nome do usuário e e-mail para commits
    Abrir o Eclipse, clicar no menu Window, em seguida clicar no menu Preferences, em seguida filtrar pelo opção "Git", depois clicar na opção "Configuration", em seguida na aba "User Settings" configurar a propriedade "user.name" com o seu nome de usuário do GitHub e a propriedade "user.email" com a senha do GitHub.
    
##Parte 2 - Configurar no repositório um outro Usuário GitHub como commiter
    
##Parte 3 - Configuração do token no GitHub
As configurações do link a seguir devem ser feitas no repositório GitHub **DO USUÁRIO QUE VAI REALIZAR O COMMIT, NÃO NO GitHub QUE CONTÉM O REPOSITÓRIO**;
	
  Link de referência: "https://docs.github.com/pt/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#como-criar-um-personal-access-token-classic"
    
##Parte 4 - Configuração do token no Eclipse
  Link de referência: "https://stackoverflow.com/questions/30421875/cant-connect-to-any-uri-error-while-commiting-code-from-eclipse-to-git-reposito"

##Reprodução do passo 5;    
  In your Eclipse Editor, Right click on your project -> Team -> Remote -> Configure Push to Upstream

Once the window opens, click "change..." button. Now you'll get a window called 'Select a URI'.

In the authentication part, Enter your GitHub username and DO NOT Enter your GitHub password. For this, you need to create a 'personal access token' from Github. And ENTER the 'personal access token' instead of your GitHub password, in order to connect the repository.