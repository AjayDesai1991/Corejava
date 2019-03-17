package info.intesolv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> l =new ArrayList<String>();
		l.add("india");
		l.add("pak");
		l.add("aus");
		l.add("india");
		//By using the iterator
		Iterator i=l.iterator();
		while(i.hasNext()){             
		System.out.println(i.next());
		if(l.equals("pak"))
		
			i.remove();
			
		}
		}
		
		
		/*
		 here we are using the foreach loop
		for(String s:l) {
				System.out.println(s);
		}*/
		
	/*	for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
	}


