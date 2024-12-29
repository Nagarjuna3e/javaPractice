import java.util.Scanner;
public class duplecate 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter  A   string");
  String str = sc.nextLine();
  sc.close();  
  System.out.println(dupli(str));
 }  
 public static String dupli(String str)
 {   
    String result="";
    for(int i=0;i<str.length();i++)
    {
     char ch = str.charAt(i);
     if(!result.contains(ch+""))
     {
        result+=ch;
     }
    }
    return result;
 }  
}
