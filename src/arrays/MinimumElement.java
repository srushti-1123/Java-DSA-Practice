package arrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minElement = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        System.out.println("Minimum Element in an array is: " + minElement);
    }
}
