run:
	mvn exec:java -D"exec.mainClass"="Main"

comp:
	mvn compile

test:
	mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
