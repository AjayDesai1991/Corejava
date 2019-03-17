package info.intesolv;

public class CloneExample implements Cloneable {
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
   String s= "clone example";
	public static void main(String[] args) {
		CloneExample c= new CloneExample();
		 try {
		CloneExample c1=(CloneExample)c.clone();
		 System.out.println(c.s);
		 
		 
		 } catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		

	}
}


