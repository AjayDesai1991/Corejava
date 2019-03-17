package info.intesolv;

public class ThisEx implements Runnable {
	public void run(){
		for(int i=1;i<=3;i++){
			try{
	               Thread.sleep(1000);
		 }
	         catch(InterruptedException ie){
		       ie.printStackTrace();
	         }  
			System.out.println(i);
			
		}
	}
public static void main(String ar[]){
	ThisEx t =new ThisEx();
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	 t1.start();
	 t2.start();
	
}
	
	
	   
	
		

	}

