import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Pair {
        private final String left, right;
        public Pair(String a, String b) {
            this.left = a;
            this.right = b;
        }
        @Override 
        public String toString() {
            return String.format("("+left+","+right+")");
        }
        @Override
        public boolean equals(Object o) {
            if(this == o)
                return true;
            if(null == this)
                return false;
            if(getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return Objects.equals(left, pair.left) &&
                Objects.equals(right, pair.right);
        }
        @Override
        public int hashCode() {
            return (int) left.hashCode() * right.hashCode();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<Pair> hs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            Pair pair = new Pair(pair_left[i], pair_right[i]);
            hs.add(pair);
            System.out.println(hs.size());
        }
    }
}

