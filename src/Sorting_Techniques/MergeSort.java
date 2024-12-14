package Sorting_Techniques;

import java.util.ArrayList;

public class MergeSort {

    // Divide the array by two parts until there only one element remains and merge the two divided arrays into sorted order.
    // TC - O(nlogn) SC - O(n)
    public void sort(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = (low+high) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public void merge(int[] array, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) temp.add(array[left++]);
            else temp.add(array[right++]);
        }
        while(left<=mid) temp.add(array[left++]);
        while(right<=high) temp.add(array[right++]);
        for(int i=low;i<=high;i++) array[i] = temp.get(i-low);
    }
}
