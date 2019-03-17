package info.intesolv;

public class PractiseProg {
	//linear search
	public static int binarySearch(int ar[],int key)
	{
		int start=0;
		int end=ar.length-1;
		while(start<=end)
		{
			int mid=start+end/2;
		if(key==ar[mid]){
			return mid;
			}
		if(key>ar[mid]) {
			end=mid-1;
		} else {
			start=mid+1;
		}
		}
		return -1;
	}
			
		
			
		
	

	public static void main(String[] args) {
		int ar[] ={10,20,50,3,6,5};
		PractiseProg p =new PractiseProg();
		System.out.println(p.binarySearch(ar,6));
	  
		}
		
		

	}


