package info.intesolv;

public class Test {
	Test(){
		System.out.println("parent constructor");
	}
	{
		System.out.println("instance block");
	}
	void m(){
		System.out.println("we are in method one");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		Test t =new Test();
   
	}

}
