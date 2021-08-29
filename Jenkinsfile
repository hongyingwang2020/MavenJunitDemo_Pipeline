pipeline {
    agent any 
    stages {
        stage('Compile Stage') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mv clean complie'
            }
                
            }

            
        }
        stage('Test') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mv test'
            }
        }
        }
        stage('Deploy') { 
            steps {
                withMaven (maven:'Maven3-8-2'){
                sh 'mv deploy'
            }
        }
    }
 }
}