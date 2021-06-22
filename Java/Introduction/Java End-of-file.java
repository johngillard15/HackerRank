import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        boolean exit = false;
        for(int i = 1; input.hasNextLine() && !exit; i++){
            String str = input.nextLine();
            
            if(str.contains("end-of-file"))
                exit = true;
            
            System.out.printf("%d %s%n", i, str);
        }
    }
}