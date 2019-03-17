package info.intesolv;

public class StringUnique {
	public boolean uniqueCharacter(String str){
		for(int i=0;i<=str.length();i++)
			for(int j=i+1;j<=str.length();j++)
				if(str.charAt(i)==str.charAt(j))
		return false;
		return true;
		
	}
  
	public static void main(String[] args) {
		
           StringUnique s= new StringUnique();
           String st="aabbccdd";
           		if(s.uniqueCharacter(st))
           			System.out.println("The String is"+st +" Unique charcter");
           		else
           			System.out.println(st + "is not unique");
           		
	}

}
