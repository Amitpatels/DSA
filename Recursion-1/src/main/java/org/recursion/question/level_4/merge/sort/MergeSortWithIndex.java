package org.recursion.question.level_4.merge.sort;

import java.util.Arrays;

public class MergeSortWithIndex {

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 0, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half
        while (i <= m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while (j <= e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy merged elements back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}