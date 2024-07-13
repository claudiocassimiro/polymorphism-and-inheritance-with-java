import java.util.Arrays;

// Classe abstrata Arranjo
abstract class Arranjo<T extends Number & Comparable<T>> implements Sortable {
    protected T[] arr;

    public Arranjo(T[] arr) {
        this.arr = arr;
    }

    public void insert(int index, T value) {
        arr[index] = value;
    }

    public void list() {
        System.out.println(Arrays.toString(arr));
    }

    public void remove(int index) {
        arr[index] = null; // Define como nulo, pode ser melhorado conforme necessidade
    }

    @Override
    public abstract void sort();
}