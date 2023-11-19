public class BubbleSort {

    public static void main(String[] args) {
        Integer[] list = new Integer[]{5, 1, 9, 7, 2, 3};

        int size = list.length;
        System.out.println("-------버블 정렬 전 ------");
        printArray(list);
        System.out.println("-------버블 정렬 과정 ------");
        for (int i = 0; i < size-1; i++) {
            for (int j = 1; j < size - i; j++) {

                if (list[j-1] > list[j]) {
                    int tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;

                    printArray(list);
                }
            }
        }System.out.println("-------최종------");
        printArray(list);
    }

    public static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
