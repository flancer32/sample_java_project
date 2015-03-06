# sample_java_project
Java project with maven, slf4j and testNG.

To create a runnable jar file need to perform the following steps:
1) Open cmd and type a path to project folder(e.g. cd C:/Users/Alex/git/sample_java_project/)
2) Then, type the following string:
mvn clean install
3) After maven perform their operations, just type the following:
java -cp "target/sample_java_project-1.0-SNAPSHOT.jar;target/*" com.flancer64.sample.App
4) if everything was done correctly, then the app will run in cmd!