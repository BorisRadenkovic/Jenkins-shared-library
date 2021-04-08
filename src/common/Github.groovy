package common

class Github {

    def params = [branch: 'master', credentials: 'MyGithub']
    def context
    //def clone(String repoUrl) {

    Github (context){
        this.context = context

    }


       // println("Repozitorijum je: $repoUrl")
        // echo repoUrl

     //   git branch: params.branch, credentialsId: params.credentials, url: 'https://github.com/brki18/devops_web_goat'
//git branch: params.branch, params.credentials, url: 'https://github.com/brki18/devops_web_goat'
        // }

        //git url: "https://github.com/brki18/${repoUrl}"
   // }
    void clone(String gitURLString, String branchID, String MyGithub)
    {
        context.checkout([
                $class: 'GitSCM',
                branches: [[name: branchID]],
                doGenerateSubmoduleConfigurations: false,
                extensions: [[$class: 'CleanCheckout']],
                submoduleCfg: [],
                userRemoteConfigs: [[credentialsId: MyGithub, url: gitURLString]]
        ])
    }
}
//return this