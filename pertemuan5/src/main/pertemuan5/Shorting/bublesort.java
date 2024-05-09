/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shorting;

/**
 *
 * @author LKSA HISDA
 */
public class bublesort {
     public static void main(String[] args) {
        String[] names = {"ayani", "poluhan", "graha", "yepe", "selokajang", "wonorejo", "purwokerto"};
        bubbleSort(names);
        System.out.println("Bubble Sort:");
        printArray(names);
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
