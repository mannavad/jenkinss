@Library('my-shared-library') _

pipeline{

    agent any
    //agent { label 'Demo' }
    stages{
         
         stage('Git Checkout')
        {
        steps{
            gitCheckout()
             }
        }
      
         stage('MVNbuild')
        {
        steps{
            mvnBuild()
             }
        } 
