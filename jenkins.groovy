pipeline {
    agent any
    stages {
        stage('Run Postman Tests') {
            steps {
                script {
                    sh 'newman run C:/Users/Rbriones/Documents/PetstoreFiles/SwaggerPetstore.postman_collection.json'
                }
            }
        }
    }
}
