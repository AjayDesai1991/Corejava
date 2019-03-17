package info.intesolv;
class Hello {
	public void m1() {
		System.out.println("we are in method one");
	}
}
public class InterfaceEx extends Hello {
public void m2() {
	System.out.println("we are in method two");
}
	public static void main(String[] args) {
		
      Hello h=new InterfaceEx();
      InterfaceEx i= (InterfaceEx) h;
      i.m2();
      h.m1();
	}

}
