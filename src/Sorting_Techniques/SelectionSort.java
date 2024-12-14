package Sorting_Techniques;

public class SelectionSort {

    // In selection sort we select the minimum value to the right for every iteration and swap it with current index.
    // TC - O(n*n)
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
