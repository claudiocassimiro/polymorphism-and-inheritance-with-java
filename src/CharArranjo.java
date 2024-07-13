import java.util.Arrays;

// Classe para char[]
class CharArranjo implements Sortable {
    private Character[] arr;

    public CharArranjo(Character[] arr) {
        this.arr = arr;
    }

    public void insert(int index, Character value) {
        arr[index] = value;
    }

    public void list() {
        System.out.println(Arrays.toString(arr));
    }

    public void remove(int index) {
        arr[index] = null; // Define como nulo, pode ser melhorado conforme necessidade
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) -> Character.compare(b, a)); // Ordenação decrescente
    }
}