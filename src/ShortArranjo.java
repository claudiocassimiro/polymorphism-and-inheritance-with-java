import java.util.Arrays;

class ShortArranjo extends Arranjo<Short> {
    public ShortArranjo(Short[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Short.compare(b, a)); // Ordenação decrescente
    }
}