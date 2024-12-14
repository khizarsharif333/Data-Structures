package Sorting_Techniques;

public class BubbleSort {

    // Get largest element by comparing adjacent elements and push it at the end of the array
    // worst and avg TC is O(n*n) and best TC is O(n)
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > -1; i--) {
            boolean didSwap = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap) break;
        }
        return array;
    }
}
