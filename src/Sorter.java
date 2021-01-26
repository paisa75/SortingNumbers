
public class Sorter {
    static int sorting(int arr[], int length) {

        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            array1[i] = arr[i];
        }

        int[] array2 = new int[length];
        for (int i = 0; i < length; i++) {
            array2[i] = array1[i];
        }
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            array2[i] = arr[i];

        }
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (array1[i] != array2[i]) {
                counter++;
            }
        }
        return counter;
    }

}
