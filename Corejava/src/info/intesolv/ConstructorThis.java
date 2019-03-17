package info.intesolv;

public class ConstructorThis {
	public ConstructorThis() {
		System.out.println("we are in constructor");
	}
	ConstructorThis(int a){
		this();
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		ConstructorThis c =new ConstructorThis(10);
		

	}

}
