package test.testB;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.test.base.BaseTest;
import com.weinvest.pages.TestAPage;
import com.weinvest.pages.TestBPage;

import junit.framework.Assert;

public class TestB extends BaseTest {

	@Test
	public void testATest() {

		TestCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Executing Scenario ........" + TestCaseName);
		TestBPage test_BPage = new TestBPage(driver);
		test_BPage.testBPageMethod();

		if (test_BPage.flag == true)
			Assert.assertTrue(true);
		else
			Assert.assertFalse(true);

	}

}