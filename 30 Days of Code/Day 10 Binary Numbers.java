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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String nBinary = Integer.toString(n, 2);
        
        Pattern regex = Pattern.compile("1+");
        Matcher match = regex.matcher(nBinary);
        
        List<String> matchList = new ArrayList<String>();
        while(match.find())
            matchList.add(match.group());
        
        int longest = 0;
        for(String i : matchList){
            if(i.length() > longest)
                longest = i.length();
        }
        
        System.out.println(longest);
    }
}
