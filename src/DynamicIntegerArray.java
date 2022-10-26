import java.util.Arrays;

public class DynamicIntegerArray {

    public static void main(String[] args) {
        addInt(23);
        System.out.println();
        System.out.println(removeAt(4));
        remove(2);
        System.out.println();
        addAt(0, 8);
    }


    public static int[] addInt(int value) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array1[array1.length - 1] = value;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        return array1;
    }


    public static int removeAt(int indexOfElement) {
        int[] array = {13, 15, 34, 65, 7, 5};
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
            if (i != indexOfElement) {
                array1[i] = array1[i + 1];
            } else
                return array1[indexOfElement];
        }

        return array1[indexOfElement];
    }

    public static void remove(int value) {
        int[] array = {2, 5, 3, 5, 32, 5};
        int numberOfValues = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                numberOfValues++;
            }
        }
        int[] arr = new int[array.length - numberOfValues];
        int k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != value) {
                arr[k] = array[j];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void addAt(int index, int value) {
        int[] array = {2, 5, 3, 6, 32, 10};
        int[] arr = new int[array.length + 1];
        if (index > arr.length) {
            System.out.println("it is an error");
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




