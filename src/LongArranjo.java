import java.util.Arrays;

class LongArranjo extends Arranjo<Long> {
    public LongArranjo(Long[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Long.compare(b, a)); // Ordenação decrescente
    }
}