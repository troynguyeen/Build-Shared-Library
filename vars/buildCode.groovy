def call(String maven) {
    withEnv( ["PATH+MAVEN=${tool maven}/bin"] ) {
        sh 'mvn clean package -B -DskipTests';
    }
}