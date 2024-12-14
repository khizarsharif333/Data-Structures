package Searching_Techniques;

public class Main {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) left = mid + 1;
            else if (array[mid] > target) right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(array, 9));
        System.out.println(binarySearch(array, 8));
    }
}
