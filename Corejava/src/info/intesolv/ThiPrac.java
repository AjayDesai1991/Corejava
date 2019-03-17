package info.intesolv;

public class ThiPrac {
	public void m(){
		System.out.println("we calling the method M");
	}
 public void n(){
	 m();
	 System.out.println("we are in method n");
	 //m();
 }
	public static void main(String[] args) {
		ThiPrac t = new ThiPrac();
		t.n();
		

	}

}
