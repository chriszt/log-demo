package pbao;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

public class JULTest {

    @Test
    public void test01() {
        Logger logger = Logger.getLogger("pbao.JULTest");

        logger.info("info message");

        logger.log(Level.INFO, "info message");

        String name = "zs";
        int age = 18;
        logger.log(Level.INFO, "name: " + name + ", age: " + age);
        logger.log(Level.INFO, "name: {0}, age: {1}", new Object[]{name, age});
    }

    @Test
    public void test02() {
        Logger logger = Logger.getLogger("pbao.JULTest");

        logger.setLevel(Level.CONFIG);

        logger.severe("server message");
        logger.warning("warning message");
        logger.info("info message");
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

    @Test
    public void test03() {
        Logger logger = Logger.getLogger("pbao.JULTest");

        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();

        handler.setFormatter(formatter);
        logger.addHandler(handler);

//        logger.setLevel(Level.CONFIG);
//        handler.setLevel(Level.CONFIG);

        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        logger.severe("server message");
        logger.warning("warning message");
        logger.info("info message");
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

    @Test
    public void test04() throws IOException {
        Logger logger = Logger.getLogger("pbao.JULTest");

        logger.setUseParentHandlers(false);

        FileHandler handler = new FileHandler("/tmp/JULTest.log");
        ConsoleHandler handler2 = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();

        handler.setFormatter(formatter);
        handler2.setFormatter(formatter);

        logger.addHandler(handler);
        logger.addHandler(handler2);

        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);
        handler2.setLevel(Level.CONFIG);

        logger.severe("server message");
        logger.warning("warning message");
        logger.info("info message");
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

    @Test
    public void test05() throws IOException {
        Logger logger1 = Logger.getLogger("pbao");
        Logger logger2 = Logger.getLogger("pbao.JULTest");

        System.out.println(logger1);
        System.out.println(logger1.getName());
        System.out.println(logger1.getParent());
        System.out.println(logger1.getParent().getName());

        System.out.println(logger2);
        System.out.println(logger2.getName());
        System.out.println(logger2.getParent());
        System.out.println(logger2.getParent().getName());

        logger1.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();

        handler.setFormatter(formatter);
        logger1.addHandler(handler);
        logger1.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        logger2.severe("server message");
        logger2.warning("warning message");
        logger2.info("info message");
        logger2.config("config message");
        logger2.fine("fine message");
        logger2.finer("finer message");
        logger2.finest("finest message");

    }

    @Test
    public void test06() throws IOException {
        InputStream is = new FileInputStream("/home/yl/proj/log-demo/jul/src/main/resources/logging.properties");

        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(is);

        Logger logger = Logger.getLogger("pbao.JULTest");

        logger.severe("server message");
        logger.warning("warning message");
        logger.info("info message");
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

}
