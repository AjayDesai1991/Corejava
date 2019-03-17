package info.intesolv;

class A {
	public void m1() {
		System.out.println("we are in methodone");
	}
}

public class MethodOverrideex extends A {
	public void m1(int a) {
		System.out.println("we are ine methodtwo");
	}

	public void m2() {
		System.out.println("this is new metod");
	}

	public static void main(String[] args) {
		A a = new MethodOverrideex();
		a.m1();

	}

}
