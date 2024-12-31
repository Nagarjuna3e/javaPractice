import java.util.Scanner;
public class Rightrotation 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      System.out.println("enter a number to shift");
      int num=sc.nextInt();
      System.out.println(rot(str,num));
      sc.close();  
    }
    public static String rot(String str,int num)
    {   
        String result="";
        for(int i=str.length()-num;i<str.length();i++)
        {   
            char ch = str.charAt(i);
            result+=ch; 
        }
        for(int j=0;j<str.length()-num;j++)
        {
            char ch = str.charAt(j);
            result+=ch; 
        }
      return result;
    }
}
