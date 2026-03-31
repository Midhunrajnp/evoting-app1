pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Midhunrajnp/evoting-app1.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvnw test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t evoting-app .'
            }
        }
    }
}