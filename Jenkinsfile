pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn package' 
            }
        }
        stage('Deploy') { 
            steps {
                sh 'nohup java -jar ./target/*SNAPSHOT.jar &' 
            }
        }
    }
}