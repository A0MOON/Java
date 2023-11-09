public class SelectionSort {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{5, 1, 3, 7, 2, 9};
        int size = list.length;
        System.out.println("-------선택 정렬 전 ------");
        printArray(list);
        System.out.println("-------선택 정렬 과정 ------");
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
            printArray(list);
        }
        System.out.println("-------최종 ------");
        printArray(list);
    }

    public static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
