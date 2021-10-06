package com.chriszt.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test1 {

    @Test
    public void test01() {
        Logger logger = LogManager.getLogger(Log4j2Test1.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test02() {
        Logger logger = LogManager.getLogger(Log4j2Test1.class);

        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test03() {

    }

}
