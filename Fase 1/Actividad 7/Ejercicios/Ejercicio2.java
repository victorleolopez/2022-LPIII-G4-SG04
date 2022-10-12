//PRUEBA NUMERO 1  System.out.println(metodo("42"));

// public class Ejercicio2 {
//     public static void main(String[] args) {
//         try {
//             System.out.println(metodo("42"));//metodo esta enviado el paramtro
//         } catch (Exception e) {
//             System.out.println("Excepcion en metodo ()");
//             e.printStackTrace();
//         }
//     }

//     private static int metodo(String num) {//metodo recibiendo el argumento 
//         int valor = 0;
//         try {
//             valor++; // se aumenta 1 seria que valor vale a 1
//             valor += Integer.parseInt(num); // lo esta convertiendo en entero porque el String son numeros y 1+42 igual 43
//             valor++;// de nuevo sumando mas 1 que seria 44
//             System.out.println("Valor al final del try : " + valor); //estaria imprimiendo 44 
//         } 
//         catch (NumberFormatException e) {//No hay ningun error entonce no ingresaria
//             valor += Integer.parseInt("42");
//             System.out.println("Valor al final del catch: " + valor);
//         } 
//         finally {//Si ingresaria 
//             valor++; // aumenaria en 1 ahora valor tiene 45
//             System.out.println("Valor al final de finally: " + valor);// estaria imprimiendo 45
//         }
//         valor++;// amentaria en 1 y ahora el valor seria 46
//         System.out.println("Valor antes del return : " + valor); // se imprimiria 46
//         return valor; // devolveria el valor y recien el print de la line 6 imprimiria 46
//     }
// }

// //PRUEBA NUMERO 2  System.out.println(metodo("W"));

// public class Ejercicio2 {
//     public static void main(String[] args) {
//         try {
//             System.out.println(metodo("w"));//metodo esta enviado el argumento
//         } catch (Exception e) {
//             System.out.println("Excepcion en metodo ()");
//             e.printStackTrace();
//         }
//     }

//     private static int metodo(String num) {//metodo recibiendo para el parametro de metodo
//         int valor = 0;
//         try {
//             valor++; // se aumenta 1 seria que valor vale a 1
//             valor += Integer.parseInt(num); // error como (w), no es un numero seria un error
//             valor++;// no sucede
//             System.out.println("Valor al final del try : " + valor); //no sucede
//         } 
//         catch (NumberFormatException e) {//ingresaria aqui por el error
//             valor += Integer.parseInt("42"); //el 42 que es un string se convierte a entero y se suma 42+1 = 43
//             System.out.println("Valor al final del catch: " + valor);// se imprimer el 43
//         } 
//         finally {//Si ingresaria 
//             valor++; // aumenaria en 1 ahora valor tiene 44
//             System.out.println("Valor al final de finally: " + valor);// estaria imprimiendo 44
//         }
//         valor++;// amentaria en 1 y ahora el valor seria 45
//         System.out.println("Valor antes del return : " + valor); // se imprimiria 45
//         return valor; // devolveria el valor y recien el print de la line 6 imprimiria 45
//     }
// }

//PRUEBA NUMERO 3  throw e;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            System.out.println(metodo("w"));// metodo envia un argumento
        } catch (Exception e) {//despues de pasar la funcion ingresa
            System.out.println("Excepcion en metodo ()");//imprime
            //e.printStackTrace();//aqui sale un error por el la funcion printStackTrace
            System.out.println(e);//si imprime y no sale el error muestra el error producido
        }
        System.out.println("Saliendo del programa");
    }
    private static int metodo(String num) {// metodo recibiendo
        int valor = 0;
        try {
            valor++; // se aumenta 1 seria que valor vale a 1
            valor += Integer.parseInt(num); // error como (w), no es un numero seria un error
            valor++;// no sucede
            System.out.println("Valor al final del try : " + valor); // no sucede
        } catch (NumberFormatException e) {// ingresaria aqui por el error
            valor += Integer.parseInt("42"); // el 42 que es un string se convierte a entero y se suma 42+1 = 43
            System.out.println("Valor al final del catch: " + valor);// se imprimer el 43
            throw e; // pasa el parametro del error
        } finally {// Si ingresaria
            valor++; // aumenaria en 1 ahora valor tiene 44
            System.out.println("Valor al final de finally: " + valor);// estaria imprimiendo 44
        }
        valor++;// no sucede
        System.out.println("Valor antes del return : " + valor); // no sucede
        return valor; // no sucede no retorna es un error y el throw envia el error
    }
}
