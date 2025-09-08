def call (String ProjectName, String ImageTag){
  echo 'this is building the project'
  sh "docker build -t ${ProjectName}:${ImageTag} ."
  echo 'building is sucessfuly'
}
