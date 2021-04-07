def cleanInstall () {
echo "Starting clean & install"
  
sh "mvn clean install -DskipTests"

  echo "Cean and install finished"
}
