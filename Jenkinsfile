@Library('my-shared-library') _

pipeline{

    agent any
    //agent { label 'Demo' }
    stages{
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                gitCheckout()
            }

                
            }
            stage('Buildmvn') {
            steps {
                // Get some code from a GitHub repository
                mvnBuild()
            }

                
            }
            stage('artifactoyr push') {
            steps {
                // Get some code from a GitHub repository
                jfrog()
            }

                
            }
            
          
         } 
}
