// Problem Statement:
// Write a program that takes the size of an unsorted array and its elements as input from the user. Then, take a value and a position from the user and insert the value into the array at the specified position. Finally, print the updated array.
// Input:
// An integer n representing the number of elements in the array.
// n integers representing the elements of the array.
// An integer pos representing the position (0-based index) at which to insert.
// An integer val representing the value to insert.
// Output:
// Print the updated array after insertion.

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert (0-based index):");
        int pos = sc.nextInt();

        if (pos > size || pos < 0) {
            System.out.println("Invalid position");
        } else {
            System.out.println("Enter the value to insert:");
            int value = sc.nextInt();

            for (int i = size - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }

            arr[pos] = value;
            size++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
