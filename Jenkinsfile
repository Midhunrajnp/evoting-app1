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
                bat 'mvn clean package'
            }
        }

        stage('Test Run') {
            steps {
                bat 'java -jar target/*.jar'
            }
        }
    }
}