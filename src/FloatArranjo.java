import java.util.Arrays;

class FloatArranjo extends Arranjo<Float> {
    public FloatArranjo(Float[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Float.compare(b, a)); // Ordenação decrescente
    }
}