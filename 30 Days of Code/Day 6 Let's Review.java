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
            for(int j = 0; j < str.length(); j++){
                if(j % 2 == 0)
                    System.out.print(str.charAt(j));
            }
            
            System.out.print(" ");
            
            for(int j = 0; j < str.length(); j++){
                if(j % 2 != 0)
                    System.out.print(str.charAt(j));
            }
            
            System.out.println();
        }
    }
}
