import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                vida++;
                System.out.println("Vida: " + vida + "\t¿cual es el numero secreto?");
                rp = sc.nextInt();
                if (rp == 1234)
                    fl = true;
            } while (vida < 3 && !fl);
        }
        if (fl == true)
            System.out.println("Adivinastes!!!! ");
        else
            System.out.println("UPS, Perdistes");
    }
}
