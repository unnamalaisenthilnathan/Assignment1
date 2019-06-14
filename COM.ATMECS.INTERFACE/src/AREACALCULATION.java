import java.util.logging.Logger;

interface shapes
{
	void areagen();
}
class rectangle implements shapes
{
	Logger log=Logger.getLogger("infologging");
	public void areagen()
	{
		int length=10,breadth=20;
		int area=length*breadth;
		log.info("rectangle"+area);
		
		
	}
}
class square implements shapes
{
	Logger log=Logger.getLogger("infologging");
	public void areagen()
	{
		int side=10;
		int area=side*side;
		log.info("square"+area);
		
		
	}
}
class triangle implements shapes
{
	Logger log=Logger.getLogger("infologging");
	public void areagen()
	{
		int base=5,height=5;
		double area=0.5*base*height;
		log.info("triangle"+area);
		
		
	}
}



public class AREACALCULATION {

	public static void main(String[] args) {
		
		rectangle ref=new rectangle();
		ref.areagen();
		square ref1=new square();
		ref1.areagen();
		triangle ref2=new triangle();
		ref2.areagen();
	}

		
		
	}


