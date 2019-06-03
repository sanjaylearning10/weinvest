package com.test.hotelbooking;

import com.test.base.BaseTest;
import com.testvagrant.pages.HotelBookingPage;

import org.junit.Assert;
import org.testng.annotations.Test;


public class HotelBookingTest extends BaseTest {

	@Test
	public void shouldBeAbleToSearchForHotels() {

		TestCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Executing Scenario ........" + TestCaseName);
		HotelBookingPage hotel_Booking_Page = new HotelBookingPage(driver);
		hotel_Booking_Page.shouldBeAbleToSearchForHotels();
		Assert.assertTrue(hotel_Booking_Page.validateSearch());
		
	}

}
