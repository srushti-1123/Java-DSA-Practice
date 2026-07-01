package basicmaths;

import java.util.Scanner;

public class PrimeRange {
    public static boolean checkPrime(int n) {

        if (n <= 1) return false;

        for (int i=2; i*i<=n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of starting range: ");
        int n = sc.nextInt();

        System.out.println("Enter a number of ending range: ");
        int m = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + m + " are: ");
        for(int i=n; i<=m; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
