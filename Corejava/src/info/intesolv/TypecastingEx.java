package info.intesolv;

class Base {
	void m1(){
		System.out.println("method one");
	}
}

public class TypecastingEx  extends Base{
	public static void main(String[] args) {
		TypecastingEx t= (TypecastingEx)new Base();
		

	}

}
