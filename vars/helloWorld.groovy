def call(Map config = [:]) {
    // replace sh with bat on Windows
    bat "echo hello world ${config.name} from helloWorld.groovy in global-pipeline-library"
}