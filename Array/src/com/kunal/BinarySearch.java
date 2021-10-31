package com.kunal;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private final static int SIZE = 1000000;
    public static void main(String[] args) {
        int [] array = new int[SIZE];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * SIZE);
        }

        array[array.length - 1] = 45;


        //case 1:
        Arrays.sort(array);
        int searchIndex = linearSearch(array, 45);

        System.out.println(searchIndex);

        //case 2:

        searchIndex = binarySearch(array, 45);
        System.out.println(searchIndex);
    }

    private static int linearSearch(int[] array, int element) {
//        long start = System.currentTimeMillis();
        int index = -1;
//        int count = 0;
        for (int i = 0; i < array.length; i++) {
//            count++;
            if(array[i] == element) {
//                System.out.println("count = " + count);
                index = i;
            }
//            System.out.println("linear");
        }
//        long end = System.currentTimeMillis();
//        System.out.println(start);
//        System.out.println(end);
//        System.out.println("time taken = " + (end - start));
        return index;
    }

    private static int binarySearch(int[] array, int element) {
//        long start = System.currentTimeMillis();
        int low = 0;
        int high = array.length - 1;
//        int count = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(array[mid] == element) {
//            long end = System.currentTimeMillis();
//            System.out.println("time taken = " + (end - start));
//                System.out.println("count = " + count);
                return mid;
            } else if (element > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
//            count++;
        }

//        long end = System.currentTimeMillis();
//        System.out.println("time taken = " + (end - start));
//        System.out.println(count);
        return -1;
    }

    private static int binarySearch2( int[] array , int element){
        int low = 0 ;
        int high = array.length - 1;
        while(low <= high){
            int mid  = (low + high) /2 ;
            if (array[mid] == element){
                return  mid;
            }else if(element > array[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }


}
