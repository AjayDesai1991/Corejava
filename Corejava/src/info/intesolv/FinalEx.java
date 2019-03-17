package info.intesolv;

public class FinalEx {
	final int x=100;
	void m1(){
		int x=10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		 FinalEx f= new FinalEx();
		 f.m1();

	}

}
