import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    private WebDriver driver; //драйвер с которым будем работать
    private static Logger log = LogManager.getLogger(Test1.class);

    @BeforeEach
    public void setUp() {
        //инициализация драйвера
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeAll() {
        if (driver != null)
            driver.close();
    }

    @Test
    public void firstTest() {
        driver.get("https://otus.ru");
        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям",driver.getTitle());
    }
}