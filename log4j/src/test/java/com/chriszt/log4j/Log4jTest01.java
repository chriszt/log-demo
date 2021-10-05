package com.chriszt.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

public class Log4jTest01 {

    @Test
    public void test01() {
        BasicConfigurator.configure();

        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test02() {
        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test03() {
        LogLog.setInternalDebugging(true);

        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test04() {
        LogLog.setInternalDebugging(true);

        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test05() {
        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test06() {
        Logger logger = Logger.getLogger(Log4jTest01.class);

        for (int i = 0; i < 10000; i++) {
            logger.fatal("fatal message");
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }
    }

    @Test
    public void test07() {
        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test08() {
        Logger logger = Logger.getLogger(Log4jTest01.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");

        Logger logger1 = Logger.getLogger(Logger.class);

        logger1.fatal("fatal message --");
        logger1.error("error message --");
        logger1.warn("warn message --");
        logger1.info("info message --");
        logger1.debug("debug message --");
        logger1.trace("trace message --");
    }

}
