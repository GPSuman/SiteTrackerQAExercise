package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/config/Config.properties");
			prop.load(fis);

		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-gpu", "--window-size=1920,1080");
			options.addArguments("--incognito");
//			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			driver = new ChromeDriver(options);
			logger.info("Chrome Browser is launched");
			System.out.println("Chrome Browser is launched");
		} else if (browserName.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-gpu", "--window-size=1920,1080");
			options.addArguments("--incognito");
//			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			driver = new FirefoxDriver(options);
			System.out.println("Firefox Browser is launched");
			logger.info("Firefox Browser is launched");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
