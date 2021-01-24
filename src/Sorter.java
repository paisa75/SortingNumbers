
public class Sorter {

    static int minMoves(int arr[], int n) {
        int expectedItem = n;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == expectedItem)
                expectedItem--;
        }

        return expectedItem;
    }

}
