package fileewriting;
import java.io.FileWriter;
import java.io.IOException;

public class fileewritingg {

	public static void main(String[] args) {
		FileWriter fw=null;
		try
		{
		fw=new FileWriter("C:\filewriting.txt");
		fw.write("file writer class is used for file writing operation");
		fw.flush();
		System.out.println("file written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		

}
