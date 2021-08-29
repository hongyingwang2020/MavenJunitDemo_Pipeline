pipeline {
    agent any 
    stages {
        stage('Compile Stage') { 
            steps {
                withMaven (maven:'Maven 3.3.9'){
                sh 'mv clean complie'
            }
                
            }

            
        }
        stage('Test') { 
            steps {
                withMaven (maven:'Maven 3.3.9'){
                sh 'mv test'
            }
        }
        }
        stage('Deploy') { 
            steps {
                withMaven (maven:'Maven 3.3.9'){
                sh 'mv deploy'
            }
        }
    }
 }
}