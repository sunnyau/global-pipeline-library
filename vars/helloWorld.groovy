def call(Map config = [:]) {
    // sh for linux and bat for Windows
    sh "echo hello world ${config.name} from helloWorld.groovy in global-pipeline-library"
}
