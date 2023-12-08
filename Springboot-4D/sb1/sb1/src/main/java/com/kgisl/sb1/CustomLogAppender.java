package com.kgisl.sb1;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class CustomLogAppender extends AppenderBase<ILoggingEvent> {

    private StringBuilder logs = new StringBuilder();

    @Override
    protected void append(ILoggingEvent eventObject) {
        logs.append(eventObject.getFormattedMessage()).append(System.lineSeparator());
    }

    public String getLogs() {
        return logs.toString();
    }

    public void clearLogs() {
        logs.setLength(0);
    }
}
