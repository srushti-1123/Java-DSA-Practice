package arrays;

import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Largest element is: " + secondSmallest);
    }
}
