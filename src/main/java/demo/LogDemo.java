package demo;

import org.apache.log4j.Logger;

public class LogDemo {
	
	private static final Logger logger = Logger.getLogger(LogDemo.class);
	public static void main(String[] args) {
		
		logger.trace("����trace��Ϣ");
        logger.debug("����debug��Ϣ");
        logger.info("����info��Ϣ");
        logger.warn("����warn��Ϣ");
        logger.error("����error��Ϣ");
        logger.fatal("����fatal��Ϣ");
		
		
	}
}
