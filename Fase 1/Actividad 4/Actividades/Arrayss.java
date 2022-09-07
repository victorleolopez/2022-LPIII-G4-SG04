import java.util.Arrays;

public class Arrayss {

    public static void main(String[] args) {
        int[] milista = new int[] { 11, 34, 5444, 4455, 6, 7, 8, 9, 10 };
        int numbuscado = 4455;
        if (Arrays.binarySearch(milista, numbuscado) >= 0)
            System.out.println("si existe");
        else
            System.out.println("no existe");
    }
}
