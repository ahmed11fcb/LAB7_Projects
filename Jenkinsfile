pipeline{

    agent any

    tools{
        maven 'Maven3'
    }

    stages{

        stage('Build')
                {
                    step{
                        bat 'mvn clean'
                    }
                }

        stage('Test')
                {
                    step
                    {
                        bat 'mvn test'
                    }
                }

    }

}