package Sorting_Techniques;

import java.util.Arrays;

public class InsertionSort {
    // {6,2,3,4,5};

    // start from second element and check if previous elements are not sorted then keep swapping until left end of array
    // worst and avg TC is O(n*n) and best TC is O(n)
    public void sort(int[] array){
        for(int i=1;i<array.length;i++){
            int curValue = array[i];
            int j = i-1;
            while(j>=0 && array[j]>curValue) {
                array[j+1] = array[j--];
//                System.out.println(Arrays.toString(array));
            }
            array[j+1] = curValue;
        }
//        return array;
    }
}
