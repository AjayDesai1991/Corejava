package info.intesolv;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupArray {

	public static void main(String[] args) {
		String s[]={"a","b","f","a"};
		     //we will remove duplicate by using collection
		List l=Arrays.asList(s);
		Set s1=new HashSet(l);
		
		String[] n=new String[s1.size()];
		s1.toArray(n);
		for(String l1:n)
		{
			System.out.println(l1);
		}
		
		

	}

}
