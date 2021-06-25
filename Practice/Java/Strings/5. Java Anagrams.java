import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // using Arrays.sort()
        // cant import java.util.Arrays in Hackerrank editor
        // i need use a qualified name for .sort() to work here: java.util.Arrays.sort();
        /*a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] aToChar = a.toCharArray();
        char[] bToChar = b.toCharArray();
        
        java.util.Arrays.sort(aToChar);
        java.util.Arrays.sort(bToChar);
        
        a = new String(aToChar);
        b = new String(bToChar);
        
        return a.equalsIgnoreCase(b) ? true : false;*/
        
        // using .indexOf() & .replaceFirst()
        if(a.equalsIgnoreCase(b))
            return true;
       
       if(a.length() != b.length())
            return false;
            
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        while(a.length() > 0){
            int index = b.indexOf(a.charAt(0));
            if(index != -1){
                a = a.replaceFirst(String.valueOf(a.charAt(0)), "");
                b = b.replaceFirst(String.valueOf(b.charAt(index)), "");
            }
            else
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}