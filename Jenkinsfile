pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/sahanlakmal13/mavenTest.git'
                sh 'docker-compose up -d'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
