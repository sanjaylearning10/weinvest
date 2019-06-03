package com.utilities;

import com.test.base.BaseTest;

public class WaitForMilliSeconds extends BaseTest {

	public void waitForMilliSeconds(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

}
