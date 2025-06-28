// 1. Delete an Element from an Array
// Problem:
// Given an array and a position, delete the element at the given position and print the updated array.

import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {
        int i, size, pos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position (1-based) of the element you want to delete:");
        pos = sc.nextInt();

        if (pos < 1 || pos > size) {
            System.out.println("Invalid position.");
        } else {
            // Shift elements to the left from the delete position
            for (i = pos - 1; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--; // Reduce logical size

            System.out.println("Array after deletion:");
            for (i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
