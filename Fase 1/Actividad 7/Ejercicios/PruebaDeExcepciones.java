import java.io.IOException;

public class PruebaDeExcepciones {
    // atributos
    LeerEntrada kbd = new LeerEntrada(System.in);

    // métodos
    public void procesarEntradaUsuario() throws Excepcion_vocal,
            Excepcion_blanco, Exception_salida, Excepcion_numero {
        System.out.print("Introduzca un carácter: ");
        System.out.flush();
        char ch;
        try {
            ch = Character.toUpperCase(kbd.getChar());
        } // try
        catch (IOException x) {
            System.out.println("Se ha producido una IOException.");
            return;
        } // catch
        if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
                || ch == '9' || ch == '0') {
            throw new Excepcion_numero();
        }
        if (ch == ' ') {
            throw new Excepcion_blanco();
        }
        if (ch == 'x' || ch == 'X') {
            throw new Exception_salida();
        }
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            throw new Excepcion_vocal();
        }

    } // procesar_Entrada_Usuario

    public static void main(String args[]) {
        PruebaDeExcepciones miPrueba = new PruebaDeExcepciones();
        boolean fin = false;
        do {
            try {
                miPrueba.procesarEntradaUsuario();
            } catch (Excepcion_vocal x) {
                System.out.println("Se ha producido excepción de vocal.");
            } catch (Excepcion_numero x) {
                System.out.println("Se ha producido excepción de número.");
            } catch (Excepcion_blanco x) {
                System.out.println("Se ha producido excepción de blanco.");
            } catch (Exception_salida x) {
                System.out.println("Se ha producido excepción de salida.");
                fin = true;
            } finally {
                System.out.println("Estamos en la cláusula finally.\n");
            }
        } while (!fin);
    }
}