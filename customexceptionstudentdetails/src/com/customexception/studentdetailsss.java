package com.customexception;

import java.util.logging.Logger;

public class studentdetailsss {
String studentname;
String collegename;
int cutoffmark;


public void setstudentdetails(String studentname, int cutoffmark, String collegename)
{
	this.studentname=studentname;
	this.cutoffmark=cutoffmark;
	this.collegename=collegename;
}

public void studentdetailsinf() throws studentdetailsinvalidexception {
	if(this.cutoffmark<=190)
	{
		studentdetailsinvalidexception ref= new studentdetailsinvalidexception("cutoff is not eligible");
		throw ref;
	}
	else
	{
		Logger log=Logger.getLogger("infologging");
		log.info("Student name"+this.studentname);
		log.info("collegename"+this.collegename);
		log.info("cutoffmark"+this.cutoffmark);
	}
}
	public static void main(String[] args) {
		studentdetailsss ref = new studentdetailsss();
		ref.setstudentdetails("maria",190,"Panimalar");
		try
		{
			ref.studentdetailsinf();
			
		}
		catch(studentdetailsinvalidexception e)
		{
			e.printStackTrace();
		}

	}

}
