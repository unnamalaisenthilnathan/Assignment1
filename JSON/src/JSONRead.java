

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead
{
	public static void main(String args[])
	{
	    JSONParser parser = new JSONParser();
	    try
	    {
	        Object object = parser.parse(new FileReader("C:/fileread/reading.json"));
	        
	        //convert Object to JSONObject
	        JSONObject jsonObject = (JSONObject)object;
	        
	        //Reading the String
	        String name = (String) jsonObject.get("EmployeeName");
	        Long age = (Long) jsonObject.get("EmployeeAge");
	        
	        //Reading the array
	        JSONArray AddressDetails = (JSONArray)jsonObject.get("Address");
	        
	        //Printing all the values
	        System.out.println("EmployeeName: " + name);
	        System.out.println("EmployeeAge:" + age);
	        System.out.println("Address:");
	        for(Object primaryaddressdetails :AddressDetails)
	        {
	            System.out.println("\t"+primaryaddressdetails.toString());
	        }
	    }
	    catch(FileNotFoundException fe)
	    {
	        fe.printStackTrace();
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}
