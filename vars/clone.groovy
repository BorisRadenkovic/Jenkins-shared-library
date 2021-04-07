
def params = [
    branch: 'master', 
    credentials: 'MyGithub'
    ]


def cloneRepo() {

    
    
    Github github = new Github()
    github.clone()

}
