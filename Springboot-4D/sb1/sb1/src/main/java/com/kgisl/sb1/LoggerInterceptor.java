package com.kgisl.sb1;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



@Component
public class LoggerInterceptor implements HandlerInterceptor {

    private static final Logger rootLogger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("State: Before request reaches controller");
        System.out.println("Request received for URL: " + request.getRequestURL().toString());

        // Generate a unique log file name based on the current timestamp
        String logFileName = "logs/sb1-" + System.currentTimeMillis() + ".log";

        // Set the log file name in the system properties
        System.setProperty("LOG_FILE", logFileName);

        // Capture the Spring Boot initialization logs
        captureInitializationLogs(logFileName);

        // Log the information if needed
        rootLogger.info("Using log file: {}", logFileName);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handler");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("After Completion");
    }

    private void captureInitializationLogs(String logFileName) {
        // Reset the logger context
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.reset();

        // Reconfigure the logger context
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(loggerContext);

        try {
            // Load the configuration from the default Logback configuration file
            configurator.doConfigure(getClass().getClassLoader().getResourceAsStream("logback-spring.xml"));

            // Add the file appender with the current log file name
            FileAppender<ILoggingEvent> fileAppender = new FileAppender<>();
            fileAppender.setFile(logFileName);
            fileAppender.setContext(loggerContext);

            PatternLayoutEncoder encoder = new PatternLayoutEncoder();
            encoder.setPattern("%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
            encoder.setContext(loggerContext);
            encoder.start();

            fileAppender.setEncoder(encoder);
            fileAppender.start();

            // Set the file appender to log to the current log file
            rootLogger.addAppender(fileAppender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
