package com.test.flightbooking;

import com.test.base.BaseTest;
import com.testvagrant.pages.FlightBookingPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FlightBookingTest extends BaseTest {

	@Test
	public void testThatResultsAppearForAOneWayJourney() {

		TestCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Executing Scenario ........" + TestCaseName);
		FlightBookingPage flight_booking_page = new FlightBookingPage(driver);
		flight_booking_page.flightBooking();

		Assert.assertTrue(flight_booking_page.validateSearchSummary());
	}

}
