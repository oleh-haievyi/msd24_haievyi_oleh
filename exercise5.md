# Exercise5: Logging Documentation

## 1. Why are logging libraries used?

Logging libraries are used to record events in a program. They help developers to debug and find errors while the application is running. Logging is usefull for monitoring the program and for collect important information when something goes wrong.

## 2. What log levels does Log4j have and what they mean?

Log4j has several log levels:

- **TRACE**: The most detail level, used for tracing the program step by step.
- **DEBUG**: Used for debugging informations and showing detailed process flows.
- **INFO**: Shows general information about the application's run.
- **WARN**: Shows warning messages if something unexpected happens, but the program still runs.
- **ERROR**: Indicates error messages that need attention.
- **FATAL**: Shows very critical error, which can cause the program to stop.

## 3. What configuration options does Log4j provide?

Log4j allows many configuration options. You can set different appenders, like console and file appenders, to send log messages to different targets. You can change the pattern layout to format the log messages in a specific way. Also, you can set different log levels for different parts of your application. These options help you to manage and analyse the log data in a better way.
