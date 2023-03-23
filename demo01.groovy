@Library('jenkinslibs@master') _

def tools = new org.devops.tools()


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
