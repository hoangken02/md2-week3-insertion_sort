package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size: ");
        int size = scanner.nextInt();
        int [] list = new int[size];

        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Before sorted: ");
        for (Integer i:
             list) {
            System.out.print(i + "\t");
        }

        System.out.println();

        insertionSort(list);

        System.out.println("After sorted: ");
        for (Integer i:
             list) {
            System.out.print(i + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k = i - 1;
            int currentElement = list[i];
            while(k >= 0 && list[k] > currentElement){
                list[k + 1] = list[k];
                k --;
            }
            list[k + 1] = currentElement;
        }
    }
}
