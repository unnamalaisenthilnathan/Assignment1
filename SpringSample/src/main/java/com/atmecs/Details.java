package com.atmecs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Details {

	public static void main(String[] args) {
	Employee eRef= new Employee();
	eRef.setEmployeeid(1020);
	eRef.setEmployeename("joe");
	eRef.setEmployeeaddress("India");
System.out.println(eRef);

Resource resource =new ClassPathResource("applicationContext.xml");
BeanFactory factory=new XmlBeanFactory(resource);

Employee e1 = factory.getBean("Emp",Employee.class);
System.out.println("Employee Details:"+e1);
	}

}
