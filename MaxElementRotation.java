package pratice;

public class MaxElementRotation {
public static void main(String[] args) {
	int[] arr = { 4,3,2,5,1,5,0,5};
	int[] res = new int[arr.length];
	int max=arr[0];
	int index=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++)
	{   
		if(arr[i]==max)
		{
			res[index++]=arr[i];
		}
		if(arr[i]!=max)
		{
			res[index++]=arr[i];
		}
		
		
	}
//	for(int i=0;i<arr.length;i++)
//	{   
//		if(arr[i]!=max)
//		{
//			res[index++]=arr[i];
//		}
//		
//	}
//	
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
