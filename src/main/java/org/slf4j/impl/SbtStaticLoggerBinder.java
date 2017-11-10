package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import sbt.util.Logger;

public class SbtStaticLoggerBinder implements LoggerFactoryBinder {
    public static String REQUESTED_API_VERSION = "1.8"; // !final

    public static Logger sbtLogger = null;

    private static final SbtStaticLoggerBinder SINGLETON = new SbtStaticLoggerBinder();

    private final ILoggerFactory loggerFactory;

    private SbtStaticLoggerBinder(){
        loggerFactory = new SbtLoggerFactory();
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }

    @Override
    public String getLoggerFactoryClassStr() {
        return SbtLoggerFactory.class.getName();
    }

    public static SbtStaticLoggerBinder getSingleton(){
        return SINGLETON;
    }
}
