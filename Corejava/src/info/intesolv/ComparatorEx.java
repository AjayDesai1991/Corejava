package info.intesolv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	private int id;
	private String name;
	private int age;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
  
  Student(){
  }
  
	 Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
 class AgeComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		   int age= s1.getAge();
		   int age1=s2.getAge();
		   if(age>age1){
			   return 1;
		   } else if(age<age1)
		   {
			   return -1;
		   } else 
			   return 0;
	}
	 
	 
	 
 }


public class ComparatorEx {
	
	Student s=new Student(1,"india",100);
	Student s1=new Student(2,"aji",10);
	Student s2=new Student(3,"dad",45);
	Student s3=new Student(2,"amma",40);
	
	/*ArrayList<Student> a1= new ArrayList<Student>();
	a1.add(s);
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	Collections.sort(a1,new AgeComp());
	*/
	

}
