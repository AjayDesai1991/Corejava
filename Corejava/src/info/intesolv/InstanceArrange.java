package info.intesolv;

class Hello1 {
  Hello1(){
	  System.out.println("parent constructor");
	  
  }
  {
	  System.out.println("parent block");
  }
  static {
	  System.out.println("parent static");
  }
  public void m1(){
	  System.out.println("hello parent method");
  }
}

public class InstanceArrange extends Hello1{
  public InstanceArrange() {
	System.out.println("child constructor");
}
  {
	  System.out.println("instance block child");
  }
    static {
    	System.out.println("child static block");
    }
	public static void main(String[] args) {
	InstanceArrange i= new InstanceArrange();
	i.m1();

	}

}
