/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shorting;

/**
 *
 * @author LKSA HISDA
 */
public class selectionsort {
    public static void main(String[] args) {
        String[] names = {"Jonson", "Alice", "Badang", "Edith", "Cici", "Dyrot", "Frangko","YiShunShin"};
        selectionSort(names);
        System.out.println("Selection Sort:");
        printArray(names);
    }

    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
