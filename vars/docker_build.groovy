def call (String ProjectName, String ImageTag, String DockerHubUser){
  echo 'this is building the project'
  sh "Docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo 'building is sucessfuly'
}
