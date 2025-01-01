package pratice;
import java.util.Scanner;
public class PrimeSum {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(Syatem.in);
	  System.out.println("enter number ");
	 int userinput=sc.nextInt();
	 int count=1;
	 int num=2;
	 int sum=0;
	 while(count<=userinput) {
		 if(isPrime(num)) {
			 sum=sum+num;
			 count++;
		 }
		 num++;
	 }
	 System.out.println(sum);
	
}
  static boolean isPrime(int num) {
	  int count=0;
	  for(int i=1;i<=num;i++) {
		  if(num%i==0)
		  {
			  count++;
		  }
	  }
	  if(count==2) {
		  return true;
	  }
	  return false;
  }
}
