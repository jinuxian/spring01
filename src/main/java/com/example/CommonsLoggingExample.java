package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {
		
		log2.log(Level.INFO, "Java standard logger...");
	
		log.trace("Commons 1. TRACE LEVEL LOG");
		log.debug("Commons 2. DEBUG LEVEL LOG");
		log.info("Commons 3. INFO LEVEL LOG");
		log.warn("Commons 4. WARN LEVEL LOG");
		log.error("Commons 5. ERROR LEVEL LOG");
		log.fatal("Commons 6. FATAL LEVEL LOG");
		
		log.info("###############################");
		
		
	}

}

