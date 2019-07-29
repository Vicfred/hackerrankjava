import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int idx = 1; idx <= n; idx++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int d = scanner.nextInt();
            for(int i = 0; i < d; i++) {
                numbers.add(scanner.nextInt());
            }
            al.add(numbers);
        }
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++) {
            int x,y;
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
            try {
                System.out.println(al.get(x).get(y));
            } catch(Exception ex) {
                System.out.println("ERROR!");
            }
        }
    }
}

