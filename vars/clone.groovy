def call(string url,string branch){
  echo "this for truing to clone"
  git url: "${url}",branch: "${branch}"
  echo "clone sucessfuly"
}
