def call (String PrjectName, String ImageTag, String DockerHubUser){
  sh " docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  }
