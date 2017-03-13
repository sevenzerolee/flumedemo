package com.ctsi.flum.demo;

import java.util.Date;
//import java.util.logging.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteLog {
	
	protected static final Logger logger = LoggerFactory.getLogger(WriteLog.class);
//	protected static final Logger logger = Logger.getLogger(WriteLog.class.getSimpleName());

	public static void main(String[] args) {
		
//		org.apache.flume.clients.log4jappender.Log4jAppender 
//		org.apache.log4j.DailyRollingFileAppender
		
		while (true) {
			logger.info("Hello flume ----from " + String.valueOf(new Date()));
//			System.out.println("Hello flume ----from " + String.valueOf(new Date()));
			 
			try {
				Thread.sleep(3000L);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
