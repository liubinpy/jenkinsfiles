@Library('jenkinslibs')

def tools = new org.devops.tools


pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
