import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter size of the array");
        int arraySize = scan.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter numbers");
            int input = scan.nextInt();
            if (checkIsDuplicated(input, arr)) {
                System.out.println("duplicated array item ,please enter again!");
                i--;
            } else arr[i] = input;
        }
        System.out.println("************* movement count is :" + Sorter.sorting(arr, arr.length));
    }

    private static boolean checkIsDuplicated(int input, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                return true;
            }
        }
        return false;
    }


}
