package com.chriszt.log4j2;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test2 {

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test02() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");
        logger.trace("trace message");
    }

    @Test
    public void test03() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        for (int i = 0; i < 2000; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }
    }

    @Test
    public void test04() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        for (int i = 0; i < 2000; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("--------------------");
        }
    }

    @Test
    public void test05() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        for (int i = 0; i < 2000; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("--------------------");
        }
    }

    @Test
    public void test06() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test2.class);

        for (int i = 0; i < 2000; i++) {
            logger.error("error message");
            logger.warn("warn message");
            logger.info("info message");
            logger.debug("debug message");
            logger.trace("trace message");
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("--------------------");
        }
    }

}
