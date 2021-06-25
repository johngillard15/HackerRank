import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i <= s.length() - k; i++){
            String str = s.substring(i, i+ k);
            
            if(str.compareTo(smallest) < 0)
                smallest = str;
            if(str.compareTo(largest) > 0)
                largest = str;
        }
        
        return smallest + "\n" + largest;
    }

