package com.code;

public class OrderAgnosticBinarySearch {

    public static void main(String [] args){

        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 11;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);


    }

    static int orderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        //find out the order of given number Asc or desc
        boolean isAscOrder = arr[start] < arr[end];

        //check index
        while(start <= end){

            //find the middle element
            int mid = start + (end - start ) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscOrder){
                if(target < mid){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            } else {
                if(target > mid){
                   end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
