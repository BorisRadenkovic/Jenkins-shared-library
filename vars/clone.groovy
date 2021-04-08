import common.Github

static def cloneRepo(String url, String brench, String credentials) {

    Github github = new Github(this)

    github.clone(url, brench, credentials)

}
