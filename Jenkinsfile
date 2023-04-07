pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn install' 
            }
        }
        stage('deploy') { 
            steps {
                sh 'mvn spring-boot:run' 
            }
        }
    }
}