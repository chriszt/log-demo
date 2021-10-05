package com.chriszt.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JCLTest {

    @Test
    public void test01() {
        Log log = LogFactory.getLog(JCLTest.class);

        log.info("info message");
    }

    @Test
    public void test02() {
        Log log = LogFactory.getLog(JCLTest.class);

        log.info("info message");
    }

}
