@Library('jenkinslibs@main') _

def tools = new org.devops.tools()

hello()

pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                  tools.PrintMsg("this is my lib!")
                }
            }
        }
    }
}
