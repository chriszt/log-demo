package com.chriszt.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest {

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
    }

    @Test
    public void test02() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        String name = "zs";
        int age = 18;
        logger.info("name:{},age:{}", name, age);
    }

    @Test
    public void test03() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            logger.info("info aaa");
//            logger.info("detail: {}", e);
            logger.info("detail: ", e);
        }
    }

    @Test
    public void test04() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            logger.info("detail: ", e);
        }
    }

    @Test
    public void test05() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            logger.info("detail: ", e);
        }
    }

    @Test
    public void test06() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
    }

    @Test
    public void test07() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
    }

    @Test
    public void test08() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
    }

}
