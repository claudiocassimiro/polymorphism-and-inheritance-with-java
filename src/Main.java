public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        IntArranjo intArranjo = new IntArranjo(intArray);
        System.out.println("Int Array Before Sorting:");
        intArranjo.list();
        intArranjo.sort();
        System.out.println("Int Array After Sorting:");
        intArranjo.list();

        Float[] floatArray = {5.5f, 2.2f, 9.9f, 1.1f, 5.5f, 6.6f};
        FloatArranjo floatArranjo = new FloatArranjo(floatArray);
        System.out.println("Float Array Before Sorting:");
        floatArranjo.list();
        floatArranjo.sort();
        System.out.println("Float Array After Sorting:");
        floatArranjo.list();

        Double[] doubleArray = {5.5, 2.2, 9.9, 1.1, 5.5, 6.6};
        DoubleArranjo doubleArranjo = new DoubleArranjo(doubleArray);
        System.out.println("Double Array Before Sorting:");
        doubleArranjo.list();
        doubleArranjo.sort();
        System.out.println("Double Array After Sorting:");
        doubleArranjo.list();

        Byte[] byteArray = {5, 2, 9, 1, 5, 6};
        ByteArranjo byteArranjo = new ByteArranjo(byteArray);
        System.out.println("Byte Array Before Sorting:");
        byteArranjo.list();
        byteArranjo.sort();
        System.out.println("Byte Array After Sorting:");
        byteArranjo.list();

        Short[] shortArray = {5, 2, 9, 1, 5, 6};
        ShortArranjo shortArranjo = new ShortArranjo(shortArray);
        System.out.println("Short Array Before Sorting:");
        shortArranjo.list();
        shortArranjo.sort();
        System.out.println("Short Array After Sorting:");
        shortArranjo.list();

        Long[] longArray = {5L, 2L, 9L, 1L, 5L, 6L};
        LongArranjo longArranjo = new LongArranjo(longArray);
        System.out.println("Long Array Before Sorting:");
        longArranjo.list();
        longArranjo.sort();
        System.out.println("Long Array After Sorting:");
        longArranjo.list();

        Character[] charArray = {'e', 'b', 'a', 'c', 'e', 'f'};
        CharArranjo charArranjo = new CharArranjo(charArray);
        System.out.println("Char Array Before Sorting:");
        charArranjo.list();
        charArranjo.sort();
        System.out.println("Char Array After Sorting:");
        charArranjo.list();
    }
}