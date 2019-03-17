package info.intesolv;

 class Ex {
	Ex(){
		System.out.println("parent constructor");
	}
 }
   public class SuperEx extends Ex {
	   SuperEx(){
		   System.out.println("child constructor");
	   }
	   
	public static void main(String[] args) {
		SuperEx s= new SuperEx();
		
	}
	   }
	   
	
	

	


