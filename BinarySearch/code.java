public static int binarySearch(MyArrayList<Integer> list, int key) {
        int size = list.size();
        int low = 0;
        int high = size - 1;

        if (list.get(0) < list.get(size - 1)) {
            while (low <= high) {
                int mid = (low + high) / 2;
                int midValue = list.get(mid);

                if (midValue == key) {
                    return mid;
                } else if (midValue < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        } else if (list.get(0) > list.get(size - 1)) {
            while (low >= high) {
                int mid = (low + high) / 2;
                int midValue = list.get(mid);

                if (midValue == key) {
                    return mid;
                } else if (midValue < key) {
                    low = mid - 1;
                } else {
                    high = mid + 1;
                }
            }
        }
        return -1;
