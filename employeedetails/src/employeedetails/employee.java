package employeedetails;


class Encapsulatinemployee{
    private int empid;
    private String empName;
    private int empAge;

    
    public int getempid(){
        return empid;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setempid(int newValue){
        empid = newValue;
    }
}


public class employee {

	public static void main(String[] args) {
		Encapsulatinemployee obj = new Encapsulatinemployee();
        obj.setEmpName("unnamalai");
        obj.setEmpAge(22);
        obj.setempid(1020);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee id: " + obj.getempid());
        System.out.println("Employee Age: " + obj.getEmpAge());
		
	}

}
