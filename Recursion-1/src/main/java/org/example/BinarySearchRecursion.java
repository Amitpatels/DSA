package org.example;

public class BinarySearchRecursion {

    public static void main(String [] args){
        int arr[] = {1,2,3,5,7,9,43,55};
        int target = 0;
        int index = search(arr,target,0,arr.length -1);
        System.out.println(index);
    }

    static int search(int [] arr, int target, int start, int end){

        //check condition
        if(start > end){
            return -1;
        }

        //find middle element
        int middle = start + (end - start)  / 2;

        if(arr[middle] == target){
            return middle;
        }

        if(target > arr[middle]){
           return search(arr,target,middle +1, end);
        }
        return search(arr,target, start, middle -1);
    }

}
