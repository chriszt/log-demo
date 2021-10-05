package com.chriszt.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test02() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test03() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test04() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test05() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        for (int i = 0; i < 10000; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }
    }

    @Test
    public void test06() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test07() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        for (int i = 0; i < 100; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }

        System.out.println("1-----------");
        System.out.println("2-----------");
        System.out.println("3-----------");
        System.out.println("4-----------");
        System.out.println("5-----------");
    }

    @Test
    public void test08() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

}
