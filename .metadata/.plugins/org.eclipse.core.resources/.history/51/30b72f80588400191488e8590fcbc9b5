package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.utilities.WaitForMilliSeconds;

import java.time.LocalDate;
import java.util.List;

public class FlightBookingPage {

	@FindBy(id = "OneWay")
	public WebElement OneWay;

	@FindBy(id = "FromTag")
	public WebElement FromTag;

	@FindBy(xpath = "//*[@name='destination']")
	public WebElement destinationTag;

	@FindBy(id = "SearchBtn")
	public WebElement SearchBtn;

	@FindBy(className = "searchSummary")
	public WebElement searchSummary;

	public WebDriver driver;

	public FlightBookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WaitForMilliSeconds waitFor = new WaitForMilliSeconds();

	public void flightBooking() {

		try {
			OneWay.click();

			FromTag.clear();
			FromTag.sendKeys("Bangalore");

			List<WebElement> originOptions = driver.findElements(By.xpath("//*[@id='ui-id-1']/li/a"));

			// wait for the auto complete options to appear for the origin
			waitFor.waitForMilliSeconds(2000);

			for (int i = 0; i < originOptions.size(); i++) {
				if (originOptions.get(i).getText().contains("Bangalore")) {
					originOptions.get(i).click();
				}
			}

			destinationTag.clear();
			destinationTag.sendKeys("Delhi");
			List<WebElement> destinationOptions = driver.findElements(By.xpath("//*[@id='ui-id-2']/li/a"));
			waitFor.waitForMilliSeconds(2000);
			for (int j = 0; j < destinationOptions.size(); j++) {
				if (destinationOptions.get(j).getText().contains("Delhi")) {
					destinationOptions.get(j).click();
				}
			}

			// wait for the auto complete options to appear for the destination
			// select the first item from the destination auto complete list

			LocalDate date = LocalDate.now();
			LocalDate tomorrowDate = date.plusDays(1);
			
			String[] stringDate = tomorrowDate.toString().split("-");

			waitFor.waitForMilliSeconds(2000);
			List<WebElement> calendarOptions = driver
					.findElements(By.xpath("//*[@id='ui-datepicker-div']//tbody/descendant::tr/td/a"));

			for (int k = 0; k < calendarOptions.size(); k++) {
				if (calendarOptions.get(k).getText().toString().equals(stringDate[2])) {
					calendarOptions.get(k).click();
					break;
				}
			}

			SearchBtn.click();
			waitFor.waitForMilliSeconds(2000);
		} catch (Exception e) {
			Reporter.log(e.getMessage());
		}
		
		
		
	}

	public boolean validateSearchSummary() {

		List<WebElement> flightResults = driver
				.findElements(By.xpath("//table[@class='resultUnit flightDetailsLink ']"));

		if (flightResults.size() > 0)
			return true;
		else
			return false;

	}

}
