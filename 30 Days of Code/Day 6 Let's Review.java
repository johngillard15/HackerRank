import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < N; i++){
            String str = input.nextLine();
			
            String evenChars = "";
            String oddChars = "";
            
            for(int j = 0; j < str.length(); j++){
                if(j % 2 == 0)
                    evenChars += str.charAt(j);
                else
                    oddChars += str.charAt(j);
            }
            
            System.out.println(evenChars + " " + oddChars);
        }
    }
}
