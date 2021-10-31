package com.kunal;

public class KunalArrayQues {
    public static void main(String[] args) {
        int [] array = {10, 200, 500, -8, 6, -7, 60, 56}; //input

        printArray(array);
        //expected output: 100, 200, 5, -8, 6, -7, 600, 56
        array = modifyArray(array);

        printArray(array);
        //expected output: 50, 50, 150, 50, 5, 6, 550, 50, 56
    }

    private static int[] modifyArray(int[] array) {

        for( int i = 0; i < array.length; i++ ) {
            if (array[i] < 0) {
                array = removeSpecificIndex(array, i);
            } else if ( array[i] >= 100 ) {
                array[i] = array[i] - 50;
                array = insertAtSpecific(array, i+1, 50);
            }
        }

        return array;
    }

    private static int[] removeSpecificIndex(int[] array, int index) {
        int [] newArray = new int[array.length - 1];

        for( int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for(int i = index + 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }

        return newArray;
    }

    private static int[] insertAtSpecific(int[] array, int index, int element) {
        int[] newArray = new int[array.length +1];
        for (int i = 0 ; i < index ; i++){
            newArray[i] =array[i];
        }
        for (int i = index ; i < array.length ; i++){
            newArray[i + 1] = array[i];
        }
        newArray[index] = element;
        return newArray;
    }

    //your code should be in the following section only

//    private static int[] modifyArray(int[] array) {
//        int[] newArray = new int[array.length * 2];
//        int j = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] >= 100){
//                newArray[j] = array[i] - 50;
//                j++;
//                newArray[j] = 50;
//                j++;
//            } else if (array[i] < 100 && array[i] >= 0){
//                newArray[j] = array[i];
//                j++;
//            }
//        }
//        array = new int[j];
//        for (int i = 0; i < j; i++){
//            array[i] = newArray[i];
//        }
//        //subtract 50 from any number > 100 and then append(insert after that number) 50
//        //remove all negative numbers
//
//        //change the return statement as per your logic
//        return array;
//    }


    private static void printArray(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}