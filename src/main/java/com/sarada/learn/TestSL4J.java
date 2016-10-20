package com.sarada.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class does :
 * 1) Generates sarada.log file
 * 2) Splits the log file 
 * 3) Send notification when log file contains ERROR
 * @author Sarada Chelluboyena
 *
 */
public class TestSL4J {

	public static void main(String[] args) {
		//create log instance of this class
		Logger logger = LoggerFactory.getLogger(TestSL4J.class);
		//for loop to slip the log file
		for(int i=0; i<=50000;i++) {
	     logger.info("Hello World info");
	     //log error to send email notification
	     if(i==1) 
	     logger.error("Hello World error");
		}
	}

}
