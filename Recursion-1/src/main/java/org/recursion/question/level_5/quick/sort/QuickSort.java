package org.recursion.question.level_5.quick.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {2,3,5,0,4,6};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int startIndex = lowIndex;
        int endIndex = highIndex;
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        int pivot = nums[midIndex];

        while(startIndex <=endIndex){

            while(nums[startIndex] < pivot ){
                startIndex++;
            }

            while(nums[endIndex] > pivot){
                endIndex--;
            }

            if(startIndex <= endIndex){
                int temp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }

        //now my pivot at correct index, please sort two half now.
        sort(nums,lowIndex,endIndex);
        sort(nums,startIndex,highIndex);
    }
}