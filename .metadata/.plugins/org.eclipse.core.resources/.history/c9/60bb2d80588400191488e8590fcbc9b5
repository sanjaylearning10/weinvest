package com.testvagrant.pages;

import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.utilities.WaitForMilliSeconds;

public class HotelBookingPage {

	
	@FindBy(xpath = "//*[@id='Home']//li/descendant::a[@href='/hotels']")
	public WebElement hotelLink;

	@FindBy(id = "Tags")
	public WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	public WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	public WebElement travellerSelection;
	
	public WebDriver driver;
	
	public HotelBookingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	WaitForMilliSeconds waitFor = new WaitForMilliSeconds();
	
	public void shouldBeAbleToSearchForHotels() {

		
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", hotelLink);
			
			localityTextBox.sendKeys("Indiranagar, Bangalore");
			waitFor.waitForMilliSeconds(2000);
			List<WebElement> hotels = driver.findElements(By.xpath("//*[@id='ui-id-1']/li/a"));

			for (int j = 0; j < hotels.size(); j++) {
				if (hotels.get(j).getText().contains("Indiranagar, Bangalore, Karnataka, India")) {
					hotels.get(j).click();
				}
			}

			LocalDate date = LocalDate.now();
			LocalDate checkinDate = date.plusDays(1);
			String[] stringCheckinDate = checkinDate.toString().split("-");

			waitFor.waitForMilliSeconds(2000);
			List<WebElement> FromDateOptions = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//tbody/tr/td/a"));

			for (int k = 0; k < FromDateOptions.size(); k++) {
				if (FromDateOptions.get(k).getText().toString().equals(stringCheckinDate[2])) {

					FromDateOptions.get(k).click();
					break;
				}
			}

			waitFor.waitForMilliSeconds(2000);
			LocalDate checkOutDate = date.plusDays(7);
			String[] stringCheckoutDate = checkOutDate.toString().split("-");

			List<WebElement> ToDateOptions = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//tbody/tr/td/a"));

			for (int k = 0; k < ToDateOptions.size(); k++) {
				if (ToDateOptions.get(k).getText().toString().equals(stringCheckoutDate[2])) {

					ToDateOptions.get(k).click();
					break;
				}
			}

			new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
			searchButton.click();
		} catch (Exception e) {
			Reporter.log(e.getMessage());
		}

	}

	
	public boolean validateSearch()
	{
		List<WebElement> hotelList = driver.findElements(By.xpath("//*[@class='listItem listUnit clearFix   ']"));
		
		if(hotelList.size()>0)
			return true;
		else
			return false;
	}
	

}
