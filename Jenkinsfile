pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Use 'bat' for Windows environments
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
