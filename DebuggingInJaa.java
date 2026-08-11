import java.util.*;


public class DebuggingInJaa {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        printArray(numbers);
    }

}
