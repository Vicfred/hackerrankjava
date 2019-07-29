import java.io.*;
import java.util.*;

public class Solution {
    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(capitalize(A) + " " + capitalize(B));
    }
}

