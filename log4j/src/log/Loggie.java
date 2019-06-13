package log;

import java.util.logging.Logger;

public class Loggie {
static Logger ref=Logger.getLogger(Loggie.class.toGenericString());
	public static void main(String[] args) {
		ref.info("Hello");
		
	}

}
