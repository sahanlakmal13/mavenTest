node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/mavenTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh 'docker-compose up -d'

    stage 'build'
        sh 'mvn clean install'
}
