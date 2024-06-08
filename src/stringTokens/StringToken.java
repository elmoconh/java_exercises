package stringTokens;
import java.io.*;
import java.util.*;
public class StringToken {

    
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
            String[] str = s.split("A-Za-z !,?._'@");
            System.out.println("str.toString() = " + String.valueOf(str));

            scan.close();
        }
    

}
