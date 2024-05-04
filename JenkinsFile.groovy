pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the code...'
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                echo 'Running unit tests...'
                // Example: Using JUnit for unit tests
                sh 'mvn test'
                echo 'Running integration tests...'
                // Example: Using Selenium for integration tests
            }
        }
        stage('Code Analysis') {
            steps {
                echo 'Analyzing code...'
                // Example: Using SonarQube for code analysis
            }
        }
        stage('Security Scan') {
            steps {
                echo 'Performing security scan...'
                // Example: Using OWASP ZAP for security scan
            }
        }
        stage('Deploy to Staging') {
            steps {
                echo 'Deploying to staging server...'
                // Example: Using Jenkins Deploy Plugin or AWS CLI for deployment
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                echo 'Running integration tests on staging...'
                // Example: Using Selenium for integration tests
            }
        }
        stage('Deploy to Production') {
            steps {
                echo 'Deploying to production server...'
                // Example: Using Jenkins Deploy Plugin or AWS CLI for deployment
                
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
            // Example: Send email notification for successful execution
            emailext (
                to: 's224036416@deakin.edu.au',
                subject: ' Jenkins Build Successful',
                body: 'The build executed successfully.'
            )
        }
        failure {
            echo 'Pipeline execution failed!'
            // Example: Send email notification for failed execution
            emailext (
                to: 's224036416@deakin.edu.au',
                subject: 'Jenkins Build Failed',
                body: 'The build failed. Please check logs for details.',
                attachLog: true
            )
        }
    }
}
