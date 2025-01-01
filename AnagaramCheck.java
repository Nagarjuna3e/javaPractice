package pratice;

public class AnagaramCheck {

     public static void main(String[] args) {
    	 
    	 if(isAnagram("arj d    un","arju                                                                          n")) {
    		 System.out.println("true");
    	 }else {
    		 System.out.println("No");
    	 }
     }
    	static boolean isAnagram(String str1,String str2) {
    		
    		str1=str1.replace(" " ,"").toLowerCase();
    		str2=str2.replace(" " ,"").toLowerCase();
    		
    		if(str1.length()!=str2.length()) {
    			return false;
    		}
    		
    		int[] result = new int[128];
    		for(int i=0;i<str1.length();i++) {
    			result[str1.charAt(i)]++;
    			result[str2.charAt(i)]--;
    		}
    		for(int count: result) {
    			if(count!=0) {
    				return false;
    			}
		}
    		return true;
    	}
}
