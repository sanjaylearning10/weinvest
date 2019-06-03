package com.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.sun.javafx.PlatformUtil;

public class BaseTest {
	public static WebDriver driver = null;
	public static Properties properties = new Properties();
	public static FileInputStream fis;
	public String TestCaseName;
	
	
	@BeforeSuite
	public void setUp() throws InterruptedException {
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver_window.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("disable-notifications");
			driver = new ChromeDriver(options);

		} else if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("disable-notifications");
			driver = new ChromeDriver(options);
		}

		else if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver_linux");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("disable-notifications");
			driver = new ChromeDriver(options);

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(properties.getProperty("baseURL"));
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		

	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}

}
