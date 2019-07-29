import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int idx = 1; idx <= 10; idx++) {
            System.out.println(N + " x " + idx + " = " + N*idx);
        }
    }
}

