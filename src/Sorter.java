import java.util.HashSet;
import java.util.Set;

public class Sorter {
    static int minMoves(int[] arr, int n)
    {
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }
        Object[] array = set.toArray();


        int expectedItem = n;

        for (int i = n - 1; i >= 0; i--)
        {
            if ((int)array[i] == expectedItem)
                expectedItem--;
        }

        return expectedItem;
    }
}
