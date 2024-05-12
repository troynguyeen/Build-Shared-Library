def call() {
    sh 'mvn clean package -B -DskipTests';
}