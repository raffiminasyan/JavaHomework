public class DynamicIntegerArray {
    int size = 0;
    int[] arr;
    DynamicIntegerArray(int length) {
        arr = new int[length];
    }


    public static void main(String[] args) {
        DynamicIntegerArray integerArray = new DynamicIntegerArray(10);
        integerArray.addInt(6);
        integerArray.addInt(7);
        integerArray.addInt(9);
        integerArray.addInt(10);
        integerArray.addInt(9);
        integerArray.print();
    }


    public int[] addInt(int value) {
        int[] array1;
        if (size == arr.length) {
            array1 = new int[arr.length * 2];
        } else {
            array1 = new int[arr.length];
        }

        for (int i = 0; i < size; i++) {
            array1[i] = arr[i];
        }
        array1[size] = value;
        arr = array1;
        size++;
        return arr;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeAt(int indexOfElement) {
        int[] array = {13, 15, 34, 65, 7, 5};
        for (int i = 0; i < array.length; i++) {
            if (i != indexOfElement) {
                array[i] = array[i + 1];
            } else {
                return array[indexOfElement];
            }
        }
        return array[indexOfElement];
    }


//    public static void remove(int value) {
//        int numberOfValues = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//                numberOfValues++;
//            }
//        }
//        int[] array = new int[array.length - numberOfValues];
//        int k = 0;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] != value) {
//                arr[k] = array[j];
//                k++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }


    public static void addAt(int index, int value) {
        int[] array = {2, 5, 3, 6, 32, 10};
        int[] arr = new int[array.length + 1];
        if (index > arr.length) {
            System.out.println("It is an error");
        } else {
            for (int i = 0; i < index; i++) {
                arr[i] = array[i];
            }
            arr[index] = value;
            for (int j = index; j < array.length; j++) {
                arr[j + 1] = array[j];
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}




