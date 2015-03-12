# Simple Java project
Java project with maven, logging and testing.

## Clone repository

    $ git clone git@github.com:flancer32/sample_java_project.git
    $ cd sample_java_project

## Maven tasks

### Build

    $ mvn clean
    $ mvn package
    $ mvn clean package

### Test

    $ mvn test

HTML report: target/surefire-reports/index.html

### Documentation
    
    $ mvn javadoc:javadoc

Javadoc: target/site/apidocs/index.html

### Deployment

    $ mvn assembly:assembly -DdescriptorId=jar-with-dependencies

## Launch app

    $ java -jar target/project-1.0-SNAPSHOT-jar-with-dependencies.jar

console output:

    10:40:26.433 [main] INFO  com.flancer32.sample.App: Start
    10:40:26.435 [main] INFO  com.flancer32.sample.App: === Logger internal state ===
    10:40:26,331 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
    10:40:26,331 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
    10:40:26,331 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [jar:file:/C:/work/GitHub/sample_java_project/target/project-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml]
    10:40:26,341 |-INFO in ch.qos.logback.core.joran.spi.ConfigurationWatchList@fb2c38 - URL [jar:file:/C:/work/GitHub/sample_java_project/target/project-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml] is not of type file
    10:40:26,373 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
    10:40:26,380 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
    10:40:26,382 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [STDOUT]
    10:40:26,394 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
    10:40:26,425 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
    10:40:26,426 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [FILE]
    10:40:26,427 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
    10:40:26,428 |-INFO in ch.qos.logback.core.FileAppender[FILE] - File property is set to [log/app.log]
    10:40:26,429 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to INFO
    10:40:26,429 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [STDOUT] to Logger[ROOT]
    10:40:26,430 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [com.flancer32] to INFO
    10:40:26,430 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [FILE] to Logger[com.flancer32]
    10:40:26,430 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
    10:40:26,431 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7d299b - Registering current configuration as safe fallback point
    
    10:40:26.446 [main] INFO  com.flancer32.sample.App: Stop


## Links

* [Maven](http://maven.apache.org/)
* [Maven — автоматизация сборки проекта](http://habrahabr.ru/post/77333/)
* [Apache Maven — основы](http://habrahabr.ru/post/77382/)