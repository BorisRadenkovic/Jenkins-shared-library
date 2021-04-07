class Github {

    def params = [
        
        brench: 'master',
        credentials: 'MyGithub'
    ]
    def clone() {

       // echo "${repoUrl}"

        git branch: params.branch, credentialsId: params.credentials, url: 'https://github.com/brki18/devops_web_goat'
//git branch: params.branch, params.credentials, url: 'https://github.com/brki18/devops_web_goat'
    }
}
