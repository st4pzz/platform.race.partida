pipeline {
    agent any
    stages {
        stage('Jenkins Partida') {
            steps {
                echo 'Jenkins Partida'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}