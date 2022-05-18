def buildApp(){
    echo " Build Stage"
  echo "String parameter ${Test}"
    echo " Building version ${env.NEW_VERSION}"
}
def testApp(){
     echo " test Stage"
}
def deployApp(){
    echo "Deploying version ${params.VERSION}"
                // echo " Branch name ${env.BRANCH_NAME}"
    withCredentials([usernamePassword(credentialsId: 'github_cred', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh 'echo $PASSWORD'
        // also available as a Groovy variable
        echo USERNAME
        // or inside double quotes for string interpolation
        echo "username is $USERNAME"
    }
               
    echo " Deploy Stage"
}

return this
