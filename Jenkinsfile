// 使用的是groovy 语法
pipeline {
   agent any

  // 阶段集合
   stages {
    stage('环境检查阶段') {
       // 步骤
       steps{
           sh "java -version"
           sh "git --version"
           sh "mvn -version"
       }
    }
     stage('代码开始') {
        // 步骤
        steps{
            echo "开始"
            sh "java -version"
        }
     }
     stage('代码编译') {
        // 步骤
         steps{
             echo "编译"
         }
     }
     stage('代码测试') {
         // 步骤
          steps{
              echo "测试"
          }

     }
     stage('代码完成') {
        // 步骤
       steps {
          echo "完成"
       }
     }

   }
}
