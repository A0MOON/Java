public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                elements[i] = elements[i + 1];
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
