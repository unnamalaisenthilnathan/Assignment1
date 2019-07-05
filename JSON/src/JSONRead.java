import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {

	public static void main(String[] args) throws IOException, ParseException
	{
		JSONParser  parser=new JSONParser();

		try {
			Object obj=parser.parse(new FileReader("JSONRead.json"));
			JSONObject jobj=new JSONObject();
			String name=( String) jobj.get("name");
			System.out.println();
		}
	catch(FileNotFoundException e)
	
		{
	e.printStackTrace();
	
	}
	
	
	
	

}
}