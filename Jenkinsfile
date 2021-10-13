node{
    stage 'Checkout'
        git url: 'https://github.com/sahanlakmal13/mavenTest.git'

    stage 'deploy'
        sh "chmod +x -R ${env.WORKSPACE}"
        sh './deploy.sh'

    stage 'build'
        sh 'mvn clean install'
}
