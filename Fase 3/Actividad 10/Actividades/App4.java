public class App4 {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };
        System.out.println("\n********************** Arreglos **********************\n");
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.println("\n********* Imprimir listas de un rango deseado *********\n");
        System.out.printf("Array integerArray contiene");
        imprimirArray(intArray, 0, 2);
        System.out.printf("%nArray doubleArray contiene");
        imprimirArray(doubleArray, 2, 3);
        System.out.printf("%nArray charArray contiene");
        imprimirArray(charArray, 0, 5);
        System.out.println();

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        int largo = inputArray.length - 1;
        try {
            validarLimites(largo, limiteInferior, limiteSuperior);
            System.out.print(" del limite " + limiteInferior + " al " + limiteSuperior + ": \n");
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(inputArray[i] + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

    public static void validarLimites(int largo, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {

        if (limiteInferior < 0 || limiteInferior > largo || limiteSuperior < 0 || limiteSuperior > largo
                || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Error :Limites invalidos");
        }
    }

}
