package info.intesolv;

public class SingletonEx {
	/*private static SingletonEx s;
	private SingletonEx()
	{
		System.out.println(" i am creating singleton class");
	}
  public static  SingletonEx getInstance()
  {
	  if(s==null)
	  {
		s=new SingletonEx();  
	  }
	  return s;
  }
  public void printSingleton(){
      System.out.println("Inside print Singleton");
  }
  public static void main(String ar[])
  {
	SingletonEx s1=SingletonEx.getInstance();
	SingletonEx s2=SingletonEx.getInstance();
  }*/
	private static volatile SingletonEx s;
	private SingletonEx()
	{
		System.out.println(" hello i am started singleton multiple thread allowed by using double checking");
	}
	public static  SingletonEx getInstance()

	{
		if(s==null) {
			synchronized(SingletonEx.class)
			{
				if(s==null){
					s=new SingletonEx();
				}
				}
			
			}
			return s;
	}
	
	public static void main(String ar[]){
		SingletonEx s1=SingletonEx.getInstance();
	}
	

		
	}
	
