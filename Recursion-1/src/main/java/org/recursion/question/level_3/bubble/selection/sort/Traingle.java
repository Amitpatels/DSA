package org.recursion.question.level_3.bubble.selection.sort;

import java.util.Arrays;

public class Traingle {

    public static void main(String [] args){
        triangle(5,0);
        traingle2(5,0);
        int arr [] = {3,10,2,6,1,0};
        bubbleSort(arr,arr.length -1, 0);
        System.out.println("\n\n bubble sort array : "+Arrays.toString(arr));
        int arr2 [] = {4,3,0,2,1};
        selectionSort(arr2,arr2.length,0,0);
        System.out.println("\n\n selection sort array : "+Arrays.toString(arr2));
    }

    public static void triangle(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print(" * ");
            triangle(row,col+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    public static void traingle2(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            traingle2(row, col+1);
            System.out.print(" * ");
        } else {
            traingle2(row -1, 0);
            System.out.println();
        }
    }

    public static void bubbleSort(int arr[], int row, int col){
        if(row==0){
            return;
        }

        if(col < row){

            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }

            bubbleSort(arr,row,col + 1);
        } else {
            bubbleSort(arr, row -1, 0);
        }
    }

    static void selectionSort(int[] arr, int row, int col, int max){
        if(row==0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[max]){
                selectionSort(arr,row,col+1,col);
            }else{
                selectionSort(arr,row,col+1,max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr,row-1,0,0);
        }
    }
}
