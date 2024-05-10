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
               echo 'Using JUnit for unit tests'
                echo 'Running integration tests...'
                echo 'Using Selenium for integration tests.'
            }
        }
        stage('Code Analysis') {
            steps {
                echo 'Analyzing code...'
                echo 'Example: Using SonarQube for code analysis'
            }
        }
        stage('Security Scan') {
            steps {
                echo 'Performing security scan...'
                echo 'Example: Using OWASP ZAP for security scan'
            }
        }
        stage('Deploy to Staging') {
            steps {
                echo 'Deploying to staging server...'
                echo 'Example: Using Jenkins Deploy Plugin or AWS CLI for deployment.'
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                echo 'Running integration tests on staging...'
                echo 'Example: Using Selenium for integration tests.'
            }
        }
        stage('Deploy to Production') {
            steps {
                echo 'Deploying to production server...'
                echo 'Example: Using Jenkins Deploy Plugin or AWS CLI for deployment.'
            }
        }
    }

    post {           
        success {
            emailext(
               subject: "SUCCESS: Jenkins Pipeline  #${env.BUILD_NUMBER}",
                body: '''<html>
                            <body>
                         <p>The Pipeline build has completed successfully.</p>
                         <p>Check console output at <a href="${BUILD_URL}console">here</a> to view the full results.</p>
                            </body>
                          </html>''',
                to: 'prethyushamadhavan@gmail.com',
                replyTo: 'notification@jenkins.com',
                mimeType: 'text/html',
                attachLog: true
            )
        }
        failure {
            emailext(
                subject: "FAILURE: Jenkins Pipeline  #${env.BUILD_NUMBER}",
                body: '''<html>
                            <body>
                             <p>The Pipeline build has failed.</p>
                             <p>Check console output at <a href="${BUILD_URL}console">here</a> to view the full results.</p>
                            </body>
                          </html>''',
                to: 'prethyushamadhavan@gmail.com',
                replyTo: 'notification@jenkins.com',
                mimeType: 'text/html',
                attachLog: true
            )
        }
    }
}
