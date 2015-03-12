/**
 * 
 */
package com.flancer32.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * Main class for the application.
 *
 */
public class App {
	final static Logger log = LoggerFactory.getLogger(App.class);

	/**
	 * This method allows to the App class to be a runnable.
	 * 
	 * http://stackoverflow.com/questions/146576/why-is-the-java-main-method-
	 * static http://docs.oracle.com/javase/tutorial/getStarted/application/
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("Start");
		log.info("=== Logger internal state ===");
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
		log.info("Stop");
	}

}
