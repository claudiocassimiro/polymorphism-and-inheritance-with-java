import java.util.Arrays;

class ByteArranjo extends Arranjo<Byte> {
    public ByteArranjo(Byte[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Byte.compare(b, a)); // Ordenação decrescente
    }
}