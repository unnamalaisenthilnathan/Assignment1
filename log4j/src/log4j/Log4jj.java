package log4j;

import java.util.logging.Logger;

public class Log4jj {
     
 static Logger log=Logger.getLogger(Log4jj.class.toGenericString());
	public static void main(String[] args) {
		
		 //( log).debug("Hello this is a debug message");
		log.info("Hello this is an info message");
	}

}

