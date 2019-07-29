import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.trim().split("[ !,?._'@]+");
        if(tokens.length == 0 || tokens[0].equals("")) {
            System.out.println("0");
            System.exit(0);
        }
        System.out.println(tokens.length);
        for(String token: tokens)
            System.out.println(token);
        scan.close();
    }
}

