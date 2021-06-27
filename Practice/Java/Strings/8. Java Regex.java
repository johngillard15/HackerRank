import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    private String check255 = "([0-1]?\\d{1,2}|2([0-4]\\d|5[0-5]))";
    public String pattern = String.format("%s\\.%s\\.%s\\.%s", check255, check255, check255, check255);
}