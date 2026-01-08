public class PalindromeTest1 {

    //method to check if a string is palindrome
    public static boolean validPalindrome(String s) {
           for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
               if (s.charAt(i) != s.charAt(j)) {
                   return false;
               }
           }
           return true;
       }
    
       public static void main(String[] args) {
           String s1 = "katak";
           String s2 = "makan";
           String s3 = "kasur";
           String s4 = "kasur ini rusak";
           boolean b1 = validPalindrome(s1);
           boolean b2 = validPalindrome(s2);
           boolean b3 = validPalindrome(s3);
           boolean b4 = validPalindrome(s4);
           System.out.println("Apakah " + s1 + " adalah palindrome? " + b1);
           System.out.println("Apakah " + s2 + " adalah palindrome? " + b2);
           System.out.println("Apakah " + s3 + " adalah palindrome? " + b3);
           System.out.println("Apakah " + s4 + " adalah palindrome? " + b4);
    
    
       }
    
    }