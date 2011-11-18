package org.slf4j.impl;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

import com.liferay.portal.kernel.log.Log;

/**
 * @author Anders Asplund
 *
 */
public class LiferayLoggerAdapter extends MarkerIgnoringBase {
    private static final long serialVersionUID = 1L;
    final transient Log log;

    LiferayLoggerAdapter(Log logger) {
        this.log = logger;
    }

    @Override
    public void debug(String msg) {
        log.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        if(log.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log.debug(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String format, Object[] argArray) {
        if (log.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log.debug(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String msg, Throwable t) {
        log.debug(msg, t);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        if (log.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log.debug(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String msg) {
        log.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        if(log.isErrorEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log.error(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String format, Object[] argArray) {
        if (log.isErrorEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log.error(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String msg, Throwable t) {
        log.error(msg, t);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        if (log.isErrorEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log.error(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String msg) {
        log.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        if(log.isInfoEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log.info(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String format, Object[] argArray) {
        if (log.isInfoEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log.info(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String msg, Throwable t) {
        log.info(msg, t);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        if (log.isInfoEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log.info(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    @Override
    public void trace(String msg) {
        log.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        if(log.isTraceEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log.trace(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String format, Object[] argArray) {
        if (log.isTraceEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log.trace(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String msg, Throwable t) {
        log.trace(msg, t);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        if (log.isTraceEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log.trace(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String msg) {
        log.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        if(log.isWarnEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log.warn(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String format, Object[] argArray) {
        if (log.isWarnEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log.warn(ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String msg, Throwable t) {
        log.warn(msg, t);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        if (log.isWarnEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log.warn(ft.getMessage(), ft.getThrowable());
        }
    }
}
