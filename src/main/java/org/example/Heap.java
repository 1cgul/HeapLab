package org.example;

public class Heap {
    private int[] arr;
    private int sizeOfArray;
    public Heap(){
        sizeOfArray = 10;
        arr = new int[sizeOfArray];
    }
    public Heap(int[] arr, int sizeOfArray){
        this.arr = arr;
        this.sizeOfArray = sizeOfArray;
    }
    int getParentIndex(int index){
        return (int)Math.floor((index-1)/2);
    }
    int getLeftChildIndex(int index){
        return 2*index+1;
    }
    int getRightChildIndex(int index){
        return 2*index+2;
    }
    void swap(int index1, int index2){
        int temp;
        temp = index1;
        index2 = index1;
        index1 = temp;
    }
    void heapifyUp(int index){
        if(index == 0){

        }
    }
    void heapifyDown(int index){

    }
    void add(int item){

    }
    void show(){
        for(int i = 0; i < sizeOfArray; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
