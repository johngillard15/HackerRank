import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String reverse = "";
        A = A.toLowerCase();
        
        for(int i = A.length() - 1; i >= 0 ; i--){
            reverse += A.charAt(i);
        }
        
        System.out.println(reverse.equals(A) ? "Yes" : "No");
    }
}