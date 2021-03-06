package com.kunal;

public class KunalArrayQues {

    public static void main(String[] args) {
        int[] array = {100, 200, 5, -8, 6, -7, 600, 56}; //input

        printArray(array);
        //expected output: 100, 200, 5, -8, 6, -7, 600, 56
        array = modifyArray(array);

        printArray(array);
        //expected output: 50, 50, 150, 50, 5, 6, 550, 50, 56
    }

    //your code should be in the following section only

    private static int[] modifyArray(int[] array) {
        //subtract 50 from any number > 100 and then append(insert after that number) 50
        //remove all negative numbers

        //change the return statement as per your logic
        int[] newArray = new int[array.length];
        for (int i = 0 ;i < array.length ; i++) {
            if (array[i] > 100) {
                newArray[i] = array[i] - 50;
            }
        }

        for (int i = 0 ; i < array.length ;i++){
            if (array[i] >= 0){
                newArray[i++] = array[i];
            }

        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i + "*-*-* " +array[i] );
        }
        //print the array
    }
}

