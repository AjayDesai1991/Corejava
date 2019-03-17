package info.intesolv;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the string");
	String s=	in.nextLine();
	String s1=s.replaceAll("[aeiouAEIOU]","");
	System.out.println(s1);
	

	}

}
