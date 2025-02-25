package MyArray;

import java.util.Arrays;

class MyArray<T>  {
    private Object[] elements;
    private int size;

    /*Конструктор*/
    public MyArray() {
        elements = new Object[10];
        size = 0;
    }
    /*Добавление*/
    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }
    /*Получение*/
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }
    /*Удаление*/
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }
    /*Добавление всего содержимого из атрибута (массива)*/
    public void addAll(MyArray<T> otherList) {
        for (int i = 0; i < otherList.size; i++) {
            add(otherList.get(i));
        }
    }

    public void bubbleSort() {
        boolean isSwapped;
        for (int i = 0; i < size - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) elements[j]).compareTo((T) elements[j + 1]) > 0) {
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
