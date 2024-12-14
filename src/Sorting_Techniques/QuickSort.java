package Sorting_Techniques;

public class QuickSort {
    // {1,2,8,5,1,4,23};

    // Divide and conquer
    // TC - O(NLOGN) SC - O(1)
    public void sort(int[] array,int low,int high){
        if(low < high){
            int pInd = partition(array,low,high);
            sort(array,low,pInd-1);
            sort(array,pInd+1,high);
        }
    }

    public int partition(int[] array,int low,int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(pivot>array[j]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}
