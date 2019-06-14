package runtimepolymorphism;

import java.util.logging.Logger;

public class arithmeticoperations {
	void arithmetic (int numb, int numb1)
	{
		int result = numb+numb1;
		Logger log=Logger.getLogger("infologging");
		log.info("addition result"+result);
	}
	void arithmetic(double numb, double numb1)
	{
		double result= numb + numb1;
		Logger log=Logger.getLogger("infologging");
		log.info("multiplication result"+result);
		
	}

	public static void main(String[] args) {
		arithmeticoperations ref = new arithmeticoperations();
		ref.arithmetic(5, 10);
		ref.arithmetic(2.0, 2.5);

	}

}
