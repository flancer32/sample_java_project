# Simple Java project
Java project with maven, logging and testing.

## Clone repository

    $ git clone git@github.com:flancer32/sample_java_project.git
    $ cd sample_java_project

## Maven tasks

    $ mvn clean
    $ mvn test
    $ mvn install
    $ mvn javadoc:javadoc
    $ mvn assembly:assembly -DdescriptorId=jar-with-dependencies

## Launch app

    $ mvn clean install
    $ java -jar target/project-1.0-SNAPSHOT-jar-with-dependencies.jar

console output:

    12:49:09,108 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
    12:49:09,108 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
    12:49:09,108 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [jar:file:/C:/work/GitHub/sample_java_project/target/project-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml]
    12:49:09,119 |-INFO in ch.qos.logback.core.joran.spi.ConfigurationWatchList@d455b8 - URL [jar:file:/C:/work/GitHub/sample_java_project/target/project-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml] is not of type file
    12:49:09,149 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
    12:49:09,158 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
    12:49:09,163 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [STDOUT]
    12:49:09,214 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - This appender no longer admits a layout as a sub-component, set an encoder instead.
    12:49:09,214 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
    12:49:09,214 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
    12:49:09,214 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.rolling.RollingFileAppender]
    
    12:49:09,216 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [FILE]
    12:49:09,225 |-INFO in c.q.l.core.rolling.TimeBasedRollingPolicy - No compression will be used
    12:49:09,226 |-INFO in c.q.l.core.rolling.TimeBasedRollingPolicy - Will use the pattern log/ptt.%d{yyyy-MM-dd}.log for the active file
    12:49:09,229 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - The date pattern is 'yyyy-MM-dd' from file name pattern 'log/ptt.%d{yyyy-MM-dd}.log'.
    12:49:09,229 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - Roll-over at midnight.
    12:49:09,230 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - Setting initial period to Tue Mar 10 12:49:09 EET 2015
    12:49:09,231 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
    12:49:09,235 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - Active log file name: log/ptt.2015-03-10.log
    12:49:09,235 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - File property is set to [null]
    12:49:09,236 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to INFO
    12:49:09,236 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [STDOUT] to Logger[ROOT]
    12:49:09,236 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [com.flancer64] to INFO
    12:49:09,236 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [FILE] to Logger[com.flancer64]
    12:49:09,236 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
    12:49:09,237 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@14a7090 - Registering current configuration as safe fallback point
    
    12:49:09.258 [main] INFO  com.flancer32.sample.App - Start
    12:49:09.261 [main] INFO  com.flancer32.sample.App - Stop


## Links

* [Maven](http://maven.apache.org/)
* [Maven — автоматизация сборки проекта](http://habrahabr.ru/post/77333/)
* [Apache Maven — основы](http://habrahabr.ru/post/77382/)