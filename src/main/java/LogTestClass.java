import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTestClass {
    private static Logger log = LogManager.getLogger(Logger.class);

    public static void main(String[] args) {

        log.error("Я инфо лог");
        log.info("Я трайс лог");
    }
}
