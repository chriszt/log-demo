package com.chriszt1;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test3 {

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(Log4j2Test3.class);

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
