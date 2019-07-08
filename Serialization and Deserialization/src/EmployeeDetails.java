import java.lang.reflect.Modifier;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmployeeDetails {

	public static void main(String[] args) {
		GsonBuilder builder = new GsonBuilder(); 
	      builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);    
	      Gson gson = builder.create();  
	      Employee emp=new Employee();
	      emp.setEmployeeage(24);
	      emp.setEmployeename("raj");
	      emp.setId(1020);
	      String jsonString = gson.toJson(emp); 
	      System.out.println(jsonString);  

	}

}
