class GitManager {

    static void clone(Script scriptRef, String gitURLString, String branchID, String MyGithub)
    {
        scriptRef.checkout([
                $class: 'GitSCM',
                branches: [[name: branchID]],
                doGenerateSubmoduleConfigurations: false,
                extensions: [[$class: 'CleanCheckout']],
                submoduleCfg: [],
                userRemoteConfigs: [[credentialsId: MyGithub, url: gitURLString]]
        ])
    }
}
