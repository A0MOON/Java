public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (E) elements[index];
    }
