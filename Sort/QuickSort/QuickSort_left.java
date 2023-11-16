import java.util.Arrays; // left pivot

public class QuickSort9 {

    public static void QuickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);

            QuickSort(array, start, pivotIndex - 1);
            QuickSort(array, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];

        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            while (left <= right && array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
            }
        }

        swap(array, start, right);

        return right;
    }

    public static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,9,4,7,5,0,1,6,8,2};
        int size = array.length;

        QuickSort(array, 0, size - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
