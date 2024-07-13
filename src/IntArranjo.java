import java.util.Arrays;

class IntArranjo extends Arranjo<Integer> {
    public IntArranjo(Integer[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> b - a); // Ordenação decrescente
    }
}