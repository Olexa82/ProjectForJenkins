import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class World {
    private static final Logger logger = LogManager.getLogger(World.class);
    @Test
            public void printLog() {
        logger.info("Hello World!!");
    }
}
