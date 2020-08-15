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
		stage("Quality Gate Status Check") {
			steps {
				script {
					withSonarQubeEnv('sonarserver') {
						bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
					}
					timeout(time: 1, unit:'HOURS') {
						def qg = waitForQualityGate()
						if(qg.status != 'ok') {
							error "pipeline aborted due to quality gate failure ${qg.status}"
						}
					}
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