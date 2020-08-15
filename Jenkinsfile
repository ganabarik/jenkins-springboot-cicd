pipeline {
	agent any
	
	stages {
		stage('Compile Stage') {
			
			steps {
				withMaven(maven : 'jenkin-maven') {
					sh 'mvn clean comile'
				}
			}
		}
		stage("Testing stage") {
			steps {
				withMaven(maven : 'jenkin-maven') {
					sh 'mvn test'
				}
			}
		}
		stage("Install stage") {
			steps {
				withMaven(maven : 'jenkin-maven') {
					sh 'mvn install'
				}
			}
		}
	}
}