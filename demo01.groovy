@Library('jenkinslibs@main') _

def build = new org.devops.build()


String buildType = "${env.buildType}"
String buildShell = "${env.buildShell}"
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script{
                   build.Build(buildType, buildShell)
                }
            }
        }
    }
}
