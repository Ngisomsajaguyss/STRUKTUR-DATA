/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Shorting;

/**
 *
 * @author LKSA HISDA
 */
public class insertionsort {
 public static void main(String[] args) {
        String[] names = {"Joni", "Aliya", "Boboboy", "Edella", "Cece", "Dudung", "Faisal"};
        insertionSort(names);
        System.out.println("Insertion Sort:");
        printArray(names);
    }

    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
