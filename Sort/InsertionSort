public class insertion {

    public static void main(String[] args) {
        Integer[] list = new Integer[]{5, 1, 9, 7, 2, 3};

        int size = list.length;
        System.out.println("-------삽입 정렬 전 ------");
        printArray(list);
        System.out.println("-------삽입 정렬 과정 ------");
        for (int i = 1; i < size; i++) {
            int currentElement = list[i];
            int j = i - 1;

            while (j >= 0 && currentElement < list[j]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = currentElement;
        }
        System.out.println("-------최종------");
        printArray(list);
        ;
    }


    public static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
