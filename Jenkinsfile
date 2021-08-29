pipeline {
    agent any 
    stages {
        stage('Compile Stage') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mvn clean complie'
            }
                
            }

            
        }
        stage('Test') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mvn test'
            }
        }
        }
        stage('Deploy') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mvn deploy'
            }
        }
    }
 }
}
