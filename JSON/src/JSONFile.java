import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFile {
	public static void main(String[] args) {
		JSONObject jref = new JSONObject();
		jref.put("Employee name", " Rohit");
		jref.put("Employee id", "1020");
		jref.put("Employee Salary", "10,000");

		JSONArray jarray = new JSONArray();

		jarray.add("1st year salary hike:5000");
		jarray.add("2nd year salary hike:6000");
		jarray.add("3rd year salary hike:7000");

		jref.put("salary details", jarray);

		try {
			FileWriter filewriter = new FileWriter("My file.json");
			filewriter.write(jref.toString());
			filewriter.flush();
			filewriter.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}