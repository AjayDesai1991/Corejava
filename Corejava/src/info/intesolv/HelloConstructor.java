package info.intesolv;

public class HelloConstructor {
	int speed;  
    
    public HelloConstructor() {
		
	System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  
       
	public static void main(String[] args) {
		 HelloConstructor b1=new HelloConstructor();  
		    HelloConstructor b2=new HelloConstructor();  

	}

}
