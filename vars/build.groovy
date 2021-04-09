def cleanInstall () {
echo "Starting clean & install"
  
sh "mvn clean install -DskipTests"

  echo "Clean and install finished"
}
