import java.util.Arrays;

class DoubleArranjo extends Arranjo<Double> {
    public DoubleArranjo(Double[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Double.compare(b, a)); // Ordenação decrescente
    }
}