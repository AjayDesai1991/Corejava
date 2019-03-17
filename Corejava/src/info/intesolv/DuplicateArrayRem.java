package info.intesolv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayRem {

	public static void main(String[] args) {
		List <String> l= new ArrayList<String>();
		l.add("one");
		l.add("four");
		l.add("three");
		l.add("one");
		l.add("none");
		//System.out.println(l);
        
		   /* Set <String>s =new HashSet<String>();
		    s.addAll(l);
		    l.clear();
		    l.addAll(s);
		    System.out.println(l);*/
		//how to remove duplicates without using the collections
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					l.remove(j);
					j--;
				}
			}
		}
			System.out.println(l);
		
		
		

	}

}
