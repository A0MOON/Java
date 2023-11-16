import java.util.Arrays; // middle pivot

public class QuickSort8 {

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);

            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];

        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,9,4,7,5,0,1,6,8,2};
        int size = array.length;
        quickSort(array, 0, size - 1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
