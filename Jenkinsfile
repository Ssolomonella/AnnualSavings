pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh 'javac Main.java'
        }
    }

    stage('Unit Test') {
        steps {
            sh 'java -cp .:junit.jar
org.junit.runner.JunitCoreMainTest'
            }
        }
    }
}
