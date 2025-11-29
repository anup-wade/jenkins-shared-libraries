def call(String projectName, String tag, String dockerHubUser) {

    echo "Pushing Docker image: ${dockerHubUser}/${projectName}:${tag}"

    sh """
        docker push ${dockerHubUser}/${projectName}:${tag}
    """
}

