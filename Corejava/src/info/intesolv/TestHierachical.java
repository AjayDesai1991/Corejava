package info.intesolv;

class Cat {
	public void m() {
		System.out.println("hii");
	}
}

class Dog extends Cat {
	public void m1() {
		System.out.println("Hello");
	}
}

class Mouse extends Cat {
	public void m2() {
		System.out.println("mouse");
	}
}

public class TestHierachical {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.m2();
		// m.m1();
		m.m();

	}

}
