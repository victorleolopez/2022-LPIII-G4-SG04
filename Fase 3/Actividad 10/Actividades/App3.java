public class App3 {
    //implemetado del codigo mnimo
    public static void main(String[] args) throws Exception {
        System.out.printf("Maximo de %d, %d y %d es %d%n%n",
                3, 4, 5, maximo(3, 4, 5));
        System.out.printf("Maximo de %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, maximo(6.6, 7.7, 8.8));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("Maximo de %s, %s and %s es %s%n%n",
                "pera", "zanahoria", "uva", maximo("pera", "zanahoria", "uva"));

        System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n",
                3, 4, 5, 6, minimo(3, 4, 5, 6));
        System.out.printf("Minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("Minimo de %s, %s, %s and %s es %s%n%n",
                "pera", "zanahoria", "uva", "kiwi", minimo("pera", "zanahoria", "uva", "kiwi"));
    }

    public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
        T max = x;
        if (y.compareTo(x) > 0)
            max = y;
        if (z.compareTo(y) > 0)
            max = z;

        return max;
    }

    public static <T extends Comparable<T>> T minimo(T w, T x, T y, T z) {
        T min = w;
        if (x.compareTo(w) < 0)
            min = x;
        if (y.compareTo(x) < 0)
            min = y;
        if (z.compareTo(y) < 0)
            min = z;

        return min;
    }
}
