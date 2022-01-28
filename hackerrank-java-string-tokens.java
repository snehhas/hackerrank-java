import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.length() > 400000 || s.length() == 0 ){

           System.out.println(0);
        }else{
        String[] wordArray = s.split("[\\s,?'!_.@]+");
        List<String> wordList = Arrays.asList(wordArray);
        System.out.println(wordArray.length);
        wordList.forEach(System.out::println);}
        scan.close();
    }
}
