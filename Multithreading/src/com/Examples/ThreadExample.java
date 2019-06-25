package com.Examples;
class first extends Thread
{
	 public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(500);
			}
		     
			catch(Exception e) {
				
			}
	}}
}
class second extends Thread
{
	 public  void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(500);
			}
		
			catch(Exception e)
			{
	}
}
	}
}
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException 
	{
		first obj1=new first();
		second obj2=new second();
		obj1.start();
		try
		{
			Thread.sleep(300);
		}
	
		catch(Exception e)
		{
}
		obj2.start();
		
		obj1.join();
	    obj2.join();

		
	}
	}
