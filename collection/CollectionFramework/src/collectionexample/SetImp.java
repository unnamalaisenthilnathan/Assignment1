package collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetImp {
	public static void main(String[] args) {
		//HashSet<String> set=new HashSet<String>();
		TreeSet<String> set=new TreeSet<String>();//Data is unorderd but it is alphabetically sorted
		//Here Data is  not added as in indexing approach
		//We got hashcodes for elements which are being added
		set.add("john");
		set.add("jennie");
        set.add("jennie");
        set.add("john");
        set.add("becca");
        set.add("jim");
        set.add("jack");
        set.add("john");
        set.add("joe");
        //1.Data is unique,no redundancy
        //2.Data is unordered in output due to hashing
        System.out.println("Set is"+set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
        	String str =itr.next();
        System.out.println(str);
        	}
        set.remove("jim");
        System.out.println("after removing jim"+set);
        if(set.contains("john")){
        	System.out.println("John is in  the set");
        }
        System.out.println("set size is"+set.size());
        
}
}
