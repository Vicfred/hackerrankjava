import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-(1<<7) && x<=(1<<7)-1)System.out.println("* byte");
                if(x>=-(1<<15) && x<=(1<<15)-1)System.out.println("* short");
                if(x>=-(1<<31) && x<=(1<<31)-1)System.out.println("* int");
                if(x>=-(1<<63) && x<=(1<<63)-1)System.out.println("* long");
                else System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}

