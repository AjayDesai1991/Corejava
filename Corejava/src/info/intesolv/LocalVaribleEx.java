package info.intesolv;
class Ajay {
	public int x=20;
}
public class LocalVaribleEx extends Ajay {
	public void m1(){
		int x=3;
		
		System.out.println(x);
	}

	public static void main(String[] args) {
		LocalVaribleEx l=new LocalVaribleEx();
		l.m1();
		System.out.println(l.x);
		

	}

}
