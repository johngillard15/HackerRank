import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference(){
        // using for loop to find min/max
        // int min = 999, max = -999;
        //
        // for(int i : elements){
        //     if(i > max)
        //         max = i;
        //     if(i < min)
        //         min = i;
        // }
        
        // using Stream to get min/max
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        
        maximumDifference = Math.abs(max - min);
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}