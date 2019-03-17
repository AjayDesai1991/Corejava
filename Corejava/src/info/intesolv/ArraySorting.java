package info.intesolv;

public class ArraySorting {

	public static void main(String[] args) {
		int ar[]={10,20,5,8,};
		ar=sort(ar);
		for(int s:ar)
			System.out.println(s);
	}
		public static int[] sort(int ar[])
		{
		for(int i=0;i<=ar.length;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
			int temp=0;
			if(ar[i]>ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			}
 		}
		return ar;

	}

}
