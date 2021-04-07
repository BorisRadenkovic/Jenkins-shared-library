class Github {

    params = [
        
        brench: 'master',
        credentials: 'MyGithub'
    
    def clone(String url) {
git branch: params.branch, params.credentials, url: 'https://github.com/brki18/devops_web_goat'
    }
}
