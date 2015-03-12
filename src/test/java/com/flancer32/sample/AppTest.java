package com.flancer32.sample;

import org.testng.annotations.Test;
import com.flancer32.sample.App;

import static org.testng.Assert.assertTrue;

/**
 * Test unit for the application.
 *
 */
public class AppTest {

	/**
	 * Just start the application.
	 */
	@Test
	public void main() {
		App.main(null);
		// We have no to test smth. in this App, so just test the truth.
		assertTrue(true);
	}
}
