import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = 0;
        
        int rowLen = 6;
        int colLen = 6;
        for(int list = 0; list < colLen; list++){
            for(int index = 0; index < rowLen; index++){
                if(index + 2 < rowLen && list + 2 < colLen){
                    int sum = arr[list][index] + arr[list][index + 1] + arr[list][index + 2]
                        + arr[list + 1][index + 1]
                        + arr[list + 2][index] + arr[list + 2][index + 1] + arr[list + 2][index + 2];
                    if(sum > max)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
