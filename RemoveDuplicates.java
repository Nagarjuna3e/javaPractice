package pratice;

public class RemoveDuplicates 
{
   public static void main(String[] args) {
    String str="abcaxxbyycdefde";
    String res="";
    for(int i=0;i<str.length();i++)
    {    
    	char ch = str.charAt(i);
    	if(!res.contains(ch+"")){
    		res=res+ch;
    	} 
    }
    
    System.out.println(res);
     char[] arr = res.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length;j++)
    	{
    		if(arr[i]<arr[j])
        	{
        		char temp =arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;	
        	}
    	}
    }
    
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i]+" ");
    }
   }
}
      


