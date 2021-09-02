package demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {
	private static Logger logger = LogManager.getLogger(log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nHello World...!\n");
		
		logger.trace("this is trace msg");
		logger.info("this is information message");
		logger.error("this is an error msg");
		logger.warn("this is a warning msg");
		logger.fatal("fatal");
		
		System.out.println("\ncompleted");

	}

}
