import java.util.Scanner;
public class fib {
    public fib(int n){
        long first = 0, second = 1;
        System.out.println("fibonacci sequence up to " + n + "terms:" );

        for(int i = 1; i<=n; i++){
            System.out.println(first + "");
            long nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of term:");
        int n = s.nextInt();
        new fib(n);
        s.close();
    }
}
