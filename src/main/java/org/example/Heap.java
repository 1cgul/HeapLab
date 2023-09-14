package org.example;

public class Heap {
    private int[] arr;
    private int sizeOfArray;
    public Heap(){
        sizeOfArray = 0; //int is 0 because there are no members in the array yet
        arr = new int[10];
    }
    public Heap(int[] arr, int sizeOfArray){
        this.arr = arr;
        this.sizeOfArray = sizeOfArray;
    }
    int getParentIndex(int index){
        return Math.floorDiv(index-1, 2);
    }
    int getLeftChildIndex(int index){
        return 2*index+1;
    }
    int getRightChildIndex(int index){
        return 2*index+2;
    }
    void swap(int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    void heapifyUp(int index){
        int parentIndex = this.getParentIndex(index);
        while(arr[parentIndex] > arr[index]){ //keep going up the tree while out of order
            swap(parentIndex, index);

            index = parentIndex;
            parentIndex = this.getParentIndex(index);
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
