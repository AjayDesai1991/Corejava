package info.intesolv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {

	public static void main(String[] args) {
		List <String> l= new ArrayList<String>();
		l.add("one");
		l.add("four");
		l.add("three");
		l.add("one");
		l.add("none");
		System.out.println(l);
        
		
		List <String> c= new ArrayList<String>();
		c.add("1");
		c.add("4");
		c.add("5");
		 	l.addAll(c);
		 	//Collections.copy(c,l);
		 System.out.println(l);
		 
	}

}
