import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.length() == 0 || s.length() > 400000){
            System.out.println("0");
            return;
        }
        
        String[] strSplit = s.split("[ .,?\\_!@']+");
        
        System.out.println(strSplit.length);
        for(String str : strSplit)
            System.out.println(str);
        
        scan.close();
    }
}

