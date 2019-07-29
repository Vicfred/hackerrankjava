import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a+b;
            System.out.print(sum);
            System.out.print(" ");
            for(int j = 1; j < n; j++) {
                sum += (1<<j)*b;
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}

