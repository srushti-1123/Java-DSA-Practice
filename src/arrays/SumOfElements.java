package arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}
