package demo;

import org.apache.log4j.Logger;

public class LogDemo {
	
	private static final Logger logger = Logger.getLogger(LogDemo.class);
	public static void main(String[] args) {
		
		logger.trace("我是trace信息");
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");
        logger.fatal("我是fatal信息");
		
		
	}
}
