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
<<<<<<< HEAD
        if (fl == true)
            System.out.println("Ganastes una LAPTOP ASUS 1500G");
        else
            System.out.println("UPS, Perdistes");
=======
        if (vida == 1)
            System.out.println("EL PREMIO QUE GANASTES ES : " + Regalo.elegir(vida));
        else if (vida == 2)
            System.out.println("EL PREMIO QUE GANASTES ES : " + Regalo.elegir(vida));
        else if (vida == 3)
            System.out.println("EL PREMIO QUE GANASTES ES : " + Regalo.elegir(vida));
        else
            System.out.println("UPS, PERDISTES");
>>>>>>> rama1
    }
}
