import java.util.Arrays;

public class MergeSort4 {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int middle = array.length / 2;

            int[] leftHalf = Arrays.copyOfRange(array, 0, middle);
            int[] rightHalf = Arrays.copyOfRange(array, middle, array.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(array, leftHalf, rightHalf);
        }
    }

    public static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalf.length) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalf.length) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 8, 4, 1, 6};
        mergeSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
