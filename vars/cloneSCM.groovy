def call() {
    //Recursively delete the current directory from the workspace
    deleteDir();
    checkout scm
}