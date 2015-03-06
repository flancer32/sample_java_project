package com.flancer64.sample;

import org.testng.annotations.Test;

import com.flancer64.sample.App;

import static org.testng.Assert.assertTrue;

public class AppTest {
	@Test
	public void main() {
		App.main(null);
		assertTrue(true);
	}
}
