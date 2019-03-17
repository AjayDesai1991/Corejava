package info.intesolv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}


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

	@Override
	public int compareTo(Employee emp) {

		if(this.getId()>emp.getId())
			return 1;
		else if(this.getId()<emp.getId())
			return -1;
		else
			return 0;
	}

}

public class Main {
	public static void main(String ar[]){
    Employee e=new Employee(1,"ajay");
    Employee e2=new Employee(2,"raju");
    Employee e3=new Employee(2,"anu");
     if(e.compareTo(e2)>0){
    	System.out.println(e.getName()+ "is better"); 
     }
     else{
    	 System.out.println(e2.getName());
     }
   
	  
}
}