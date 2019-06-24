package collectionexample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;


class Student
{
	int rollno;
	String name;
}


public class ArrayImp {
	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
		ArrayList list2=new ArrayList();
		Student stu= new Student();
		stu.rollno =22;
		stu.name="unna";
		list1.add("unna");
		list1.add("raja");
		list1.add("archna");
		list1.add("Senthil");
		list1.add("alamelu");
		System.out.println(list1);
		String l =list1.get(1);
		System.out.println(l);
		list2.add("joe");
		list2.add(123);
		list2.add('a');
		list2.add(stu);
		System.out.println(list2);
		String s3 = list1.get(3);
		System.out.println(s3);
		Object s4=list2 .get(2);
		System.out.println(s4);
		list1.remove(0);
		System.out.println(list1);
		//list1.clear();
		System.out.println(list1);
		//iterate in arraylist
		//normal for loop
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		//Iterating with enhanced for loop
		for(String str:list1)
		{
			System.out.println(str);
		}
		//Iterating with iterator
		Iterator<String> itr = list1.iterator();
		//System.out.println(itr);
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//by using while loop
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(","+str);
			if(str.equals("archna")){
				itr.remove();
				
			}
			
		}
		System.out.println(list1);



	}



}
