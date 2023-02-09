package workshop;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    int size;
    int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
    }

    public void add (int element) {
        if (this.size == this.capacity) {
            resize();
        }
        this.data[this.size] = element;
        this.size++;
    }

    private void resize() {
        this.capacity *= 2;
        int [] copyArr = new  int[this.capacity];
        for (int i = 0; i < this.data.length; i++) {
            copyArr[i] = this.data[i];
        }
        this.data = copyArr;
    }

    public int get(int index) {
        checkIndex(index);
        return  this.data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int remove(int index) {
        checkIndex(index);
        int element = this.data[index];
        this.data[index] = 0;

        shiftLeft(index);
        this.size--;
        if (this.size <= this.capacity / 4) {
            shrink();
        }
        return element;
    }

    private void shrink() {
        this.capacity /= 2;
        int [] copyArr = new  int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            copyArr[i] = this.data[i];
        }
        this.data = copyArr;
    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.size - 1] = 0;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void insert(int index, int element) {
        checkIndex(index);
        if (index == this.size - 1){
            add(this.data[this.size - 1]);
            this.data[this.size - 2] = element;
        } else {
            if (this.size == this.capacity) {
                resize();
            }
            shiftRight(index);
            this.size++;
            this.data[index] = element;
        }
    }

    private void shiftRight(int index) {
        for (int i = this.size; i > index ; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}
