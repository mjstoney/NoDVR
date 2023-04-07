pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn intall' 
            }
        }
        stage('deploy') { 
            steps {
                sh 'mvn spring-boot:run' 
            }
        }
    }
}