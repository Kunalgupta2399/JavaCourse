public class Array {

    //create a class with attributes given below
    int size;
    int[] data;

    public Array(int size) {
        // using the size as parameter initiate (allocate) memory for array
        this.data = new int[size];
        this.size = size;
    }

    public int[] insert(int element) {
        //do an insert at last in the data array
        int[] newArray = new int[size + 1];

        for (int i = 0; i < newArray.length + 1; i++) {
            newArray[i + 1] = data[i];
            newArray[i] = element;
        }
        return newArray;
    }

    public int get(int index) {
        //return the element at index given
//        return 0; //change it to your logic
        return data[index];
    }

    public void insertData(int[] inputArray) {
        //copy the elements of input array to data array

        for (int i = 0; i < this.size; i++) {
            this.data[i] = inputArray[i];
        }
    }

    public void insertAtIndex(int number, int index) {
        //insert the number into the data array at index
        int[] newArray = new int[size + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = data[i];
        }

        for (int i = index; i < size; i++) {
            newArray[i + 1] = data[i];
        }

        newArray[index] = number;
        this.data = newArray;
        this.size++;
    }


    public void removeAtIndex(int index) {
        //delete the element at index
        int[] newArray = new int[size - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = data[i];
        }
        for (int i = index + 1; i < size; i++) {
            newArray[i - 1] = data[i];
        }
        this.data = newArray;
        this.size--;
    }

    public void removeElement(int element) {
        //remove the element from the data array
        int index = -1;

        for (int i = 0; i < this.size; i++) {
            if (data[i] == element) {
                index = i;
                removeAtIndex(index);
            }
        }
    }

    public void printArray() {
        //print the array
        for (int i = 0; i < this.size; i++) {
            System.out.println(i + " " + "*--*" + " " + data[i]);
        }
    }
}


