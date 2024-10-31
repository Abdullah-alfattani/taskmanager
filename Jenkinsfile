pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://your-repository-url.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
                failure {
                    mail to: 'your-email@example.com',
                         subject: "Build Failed: Tests",
                         body: "Some tests failed. Please check the Jenkins build."
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
