def call(String url, String branch){
  echo "This is the cloning the code" ,
  git url: ${url} , branch: ${branch}
  echo 'coding clone is successfull"
  
}
