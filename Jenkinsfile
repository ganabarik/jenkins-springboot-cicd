pipeline {
	agent any
	
	stages {
		stage('Compile Stage') {
			
			steps {
				withMaven(maven : 'jenkin-maven') {
					bat 'mvn clean compile'
				}
			}
		}
		stage("Testing stage") {
			steps {
				withMaven(maven : 'jenkin-maven') {
					bat 'mvn test'
				}
			}
		}
		stage("Install stage") {
			steps {
				withMaven(maven : 'jenkin-maven') {
					bat 'mvn install'
				}
			}
		}
	}
}