package pratice;

public class AnagaramCheck {

     public static void main(String[] args) {
    	 
    	 if(isAnagram("aarjun","arjun")) {
    		 System.out.println("true");
    	 }else {
    		 System.out.println("No");
    	 }
     }
    	 static boolean isAnagram(String str1, String str2) {
    	        str1 = str1.replaceAll("\\s", "").toLowerCase();
    	        str2 = str2.replaceAll("\\s", "").toLowerCase();
    	              if (str1.length() != str2.length()) {
    	            return false;
    	        }
    	        int[] charCount = new int[256];      
    	        for (int i = 0; i < str1.length(); i++) {
    	            charCount[str1.charAt(i)]++;   
    	            charCount[str2.charAt(i)]--;
    	        }
    	        for (int count : charCount) {
    	            if (count != 0) {
    	                return false; 
    	            }
    	        }
    	        return true;  
	}
}
