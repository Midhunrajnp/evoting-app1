pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/Midhunrajnp/evoting-app1.git'
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

        stage('Run App') {
            steps {
                bat 'mvnw spring-boot:run'
            }
        }
    }
}