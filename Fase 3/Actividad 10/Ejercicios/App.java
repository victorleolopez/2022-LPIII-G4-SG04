public class App {
    public static void main(String[] args) {
        String[] inputArray = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho" };
        System.out.println("Array de cadenas contiene:");
        imprimirArray(inputArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%-8s ", elemento);
        System.out.println();
    }

    public static void imprimirArray(String[] inputArray) {
        int num = 0;
        for (String elemento : inputArray) {
            num++;
            System.out.printf("%-8s %s", elemento, num % 4 == 0 ? "\n" : "");
        }
        System.out.println();
    }
}
