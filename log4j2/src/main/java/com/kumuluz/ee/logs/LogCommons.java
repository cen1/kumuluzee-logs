/**
 * Copyright (c) Sunesis d.o.o.
 */
package com.kumuluz.ee.logs;

import com.kumuluz.ee.logs.enums.LogLevel;
import com.kumuluz.ee.logs.markers.Marker;
import com.kumuluz.ee.logs.messages.*;
import com.kumuluz.ee.logs.types.LogMetrics;

/**
 * Kumuluz-logs logger interface
 *
 * @author Rok Povse, Marko Skrjanec
 */
public interface LogCommons {

    /**
     * Set the level for logging. Default is TRACE
     *
     * @param level LogLevel object defining LogCommons
     */
    void setDefaultLevel(LogLevel level);

    /**
     * @param logMessage object defining LogMessage
     */
    void logMethodEntry(LogMessage logMessage);

    /**
     * @param logMessage object defining LogMessage
     */
    void logMethodEntry(LogLevel level, LogMessage logMessage);

    /**
     * @param logMessage object defining LogMessage
     */
    void logMethodExit(LogMessage logMessage);

    /**
     * Logs method exit on TRACE level with included details.
     *
     * @param logMessage object defining LogMessage
     */
    void logMethodExit(LogLevel level, LogMessage logMessage);

    /**
     * Logs method entry
     *
     * @param logMessage object defining LogMessage
     * @return LogMetrics object with details about this monitor
     */
    LogMetrics logMethodEntryMetrics(LogMessage logMessage);

    /**
     * Logs method entry
     *
     * @param logMessage object defining LogMessage
     * @return LogMetrics object with details about this metrics
     */
    LogMetrics logMethodEntryMetrics(LogLevel level, LogMessage logMessage);

    /**
     * Logs method exit
     *
     * @param logMessage object defining LogMessage
     * @param logMetrics object defining Metrics object
     */
    void logMethodExitMetrics(LogMessage logMessage, LogMetrics logMetrics);


    /**
     * Logs method exit
     *
     * @param logMessage object defining LogMessage
     * @param logMetrics object defining Metrics object
     */
    void logMethodExitMetrics(LogLevel level, LogMessage logMessage, LogMetrics logMetrics);

    /**
     * Logs invocation of external resource
     *
     * @param logMessage object defining LogMessage
     */
    void logInvokeResourceStart(LogMessage logMessage);


    /**
     * Logs invocation of external resource
     *
     * @param logMessage object defining LogMessage
     */
    void logInvokeResourceStart(LogLevel level, Marker marker, LogMessage logMessage);

    /**
     * Logs invocation exit of external resource
     *
     * @param logMessage object defining LogMessage
     */
    void logInvokeResourceEnd(Marker marker, LogMessage logMessage);

    /**
     * Logs invocation exit of external resource
     *
     * @param logMessage object defining LogMessage
     */
    void logInvokeResourceEnd(LogLevel level, Marker marker, LogMessage logMessage);

    /**
     * Logs invocation of external resource
     *
     * @param logMessage object defining LogMessage
     * @return LogMetrics object with details about this metrics
     */
    LogMetrics logInvokeResourceStartMetrics(Marker marker, LogMessage logMessage);

    /**
     * Logs invocation of external resource on TRACE level with included details and returns object to monitor
     * performance.
     *
     * @param logMessage object defining LogMessage
     * @return LogMetrics object with details about this metrics
     */
    LogMetrics logInvokeResourceStartMetrics(LogLevel level, Marker marker, LogMessage logMessage);

    /**
     * Logs invocation exit of external resource
     *
     * @param logMessage object defining LogMessage
     * @param logMetrics object defining Metrics object
     */
    void logInvokeResourceEndMetrics(Marker marker, LogMessage logMessage,
                                     LogMetrics logMetrics);

    /**
     * Logs invocation exit of external resource
     *
     * @param logMessage object defining LogMessage
     * @param logMetrics object defining Metrics object
     */
    void logInvokeResourceEndMetrics(LogLevel level, Marker marker,  LogMessage logMessage,
                                     LogMetrics logMetrics);

}