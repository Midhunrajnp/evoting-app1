pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning repository...'
                git branch: 'main', url: 'https://github.com/Midhunrajnp/evoting-app1.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project using Maven...'
                bat 'mvnw clean package'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Creating Docker Image...'
                bat 'docker build -t evoting-app .'
            }
        }

        stage('Success') {
            steps {
                echo 'Pipeline executed successfully!'
            }
        }
    }
}