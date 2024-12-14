package Sorting_Techniques;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,8,5,1,4,23};
//        int[] array = {6,2,3,4,5};

        QuickSort obj = new QuickSort();
        obj.sort(array,0,6);
        System.out.println(Arrays.toString(array));
    }
}