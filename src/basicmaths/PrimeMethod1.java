package basicmaths;

import java.util.Scanner;

public class PrimeMethod1 {
    public static boolean checkPrime(int n) {

        if(n <= 1) {
            return false;
        }
        int count = 0;

        for(int i=2; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(!checkPrime(n)) {
            System.out.println("The given number " + n + " is a prime number");
        }
        else {
            System.out.println("The given number " + n + " is not a prime number");
        }
    }
}
