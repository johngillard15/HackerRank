import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        
        try{
            x = scan.nextInt();
            y = scan.nextInt();
            System.out.println(x / y);
        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println(e));
        }
        
        scan.close();
    }
}