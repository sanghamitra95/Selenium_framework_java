package demoLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	 static Logger logger= LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args)
	
	{
		System.out.println("\n ----------Hello WOrld---------\n");
		logger.debug("This is a debugger message");
		logger.info("This is an information message");
		logger.error("This is error message");
		logger.warn("This is a warning");
		logger.fatal("This is a fetal file");
		
		System.out.println("Test is completed");

	}

}
