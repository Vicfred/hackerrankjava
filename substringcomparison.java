import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        PriorityQueue<String> pq = new PriorityQueue<>();

        for(int i = 0; i+k <= s.length(); i++) {
            pq.add(s.substring(i,i+k));
        }

        smallest = pq.poll();
        while(null != pq.peek()) {
            largest = pq.poll();
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

