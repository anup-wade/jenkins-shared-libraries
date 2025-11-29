def call(String projectName, String tag, String dockerHubUser) {

    echo "Building Docker image: ${dockerHubUser}/${projectName}:${tag}"

    sh "docker build -t ${dockerHubUser}/${projectName}:${tag} ."
}
