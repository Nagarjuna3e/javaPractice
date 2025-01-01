package pratice;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a Pangram:");
        String str = sc.nextLine(); 

        if (isPangram(str)) {
            System.out.println("true");
        } else {
            System.out.println("NO");
        }

        sc.close(); 
    }

    static boolean isPangram(String input) {
    	
        input = input.toLowerCase(); 
        int [] alphabetPresent = new int[26]; 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
                     if (ch >= 'a' && ch <= 'z') {
                                alphabetPresent[ch - 'a'] = 1;
                  }
        }     
        for (int present : alphabetPresent) {
            if (present!=1) {
                return false;
            }
        }
        return true;
    }
}


