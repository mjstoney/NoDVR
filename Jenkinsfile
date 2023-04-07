pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn install -X -e' 
            }
        }
    }
}