def call (String ProjectName, String ImageTag){
  echo 'this is building the project'
  sh "Docker build -t ${ProjectName}:${ImageTag} ."
  echo 'building is sucessfuly'
}
