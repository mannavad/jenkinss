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
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   
                    archiveArtifacts 'target/*.jar'
                }    
            }

                
          
         } 
}
