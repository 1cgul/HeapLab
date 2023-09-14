package org.example;

public class Main {
    public static void main(String[] args) {
        int sizeOfArray = 10;
        int[] arr = new int[sizeOfArray];
        arr[0] = 50;
        arr[1] = 150;
        arr[2] = 32;
        arr[3] = 16;
        arr[4] = 323;
        arr[5] = 84;
        arr[6] = 41;
        arr[7] = 99;
        arr[8] = 100;
        arr[9] = 25;

        Heap ex = new Heap(arr, sizeOfArray);
        ex.show();
    }
}