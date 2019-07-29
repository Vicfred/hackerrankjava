import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            ll.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for(int i = 0; i < Q; i++) {
            String query = scanner.next();
            if("Insert".equals(query)) {
                int x, y;
                x = scanner.nextInt();
                y = scanner.nextInt();
                ll.add(x, y);
            } else {
                int x;
                x = scanner.nextInt();
                ll.remove(x);
            }
        }
        for(int item: ll) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }
}

