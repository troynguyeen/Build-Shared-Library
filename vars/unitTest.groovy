def call(String maven) {
    withEnv( ["PATH+MAVEN=${tool maven}/bin"] ) {
        sh 'mvn test';
        junit 'target/surefire-reports/*.xml';
    }
}