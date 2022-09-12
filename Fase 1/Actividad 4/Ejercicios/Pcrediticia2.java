import java.util.Scanner;

public class Pcrediticia2 {
    // Necesitamos realizar una evaluación crediticia a 8 personas, en esta
    // evaluación se indicará
    // el sexo (1=masculino, 2=femenino), si trabaja (1=si trabaja, 2=no trabaja) y
    // su sueldo (si
    // tiene un trabajo, sino sera un cero) estará entre 950 y 3000 (valor entero).
    // Los valores
    // pueden ser generados aleatoriamente. Calcula y muestra lo siguiente:

    // Rellena los datos de la personas con valores insertados por el usuario
    public static void rellenarPersonas(Scanner sn, int[][] bdPersonas) {
        for (int i = 0; i < bdPersonas.length; i++) {
            System.out.println("Ingresar Datos de la Persona " + (i + 1));
            for (int j = 0; j < bdPersonas[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Ingresa el Sexo " + (i + 1) + " (1=masculino, 2=femenino) : ");
                        bdPersonas[i][j] = sn.nextInt();
                        while (bdPersonas[i][j] > 2 || bdPersonas[i][j] < 1) {
                            System.out.print("Ingresa el Sexo " + (i + 1) + "  (1 o 2) : ");
                            bdPersonas[i][j] = sn.nextInt();
                        }
                        break;
                    case 1:
                        System.out.print("Ingresa el Trabaja " + (i + 1) + " (1=si trabaja, 2=no trabaja) : ");
                        bdPersonas[i][j] = sn.nextInt();
                        while (bdPersonas[i][j] > 2 || bdPersonas[i][j] < 1) {
                            System.out.print("Ingresa el Trabaja " + (i + 1) + " (1 o 2) : ");
                            bdPersonas[i][j] = sn.nextInt();
                        }
                        break;
                    case 2:
                        if (bdPersonas[i][1] == 2) {
                            bdPersonas[i][j] = 0;
                        } else {
                            System.out.print("Ingresa su sueldo 950 y 3000 (valor entero) : ");
                            bdPersonas[i][j] = sn.nextInt();
                            if (bdPersonas[i][j] > 0) {
                                while (bdPersonas[i][j] > 3000 || bdPersonas[i][j] < 950) {
                                    System.out.print("Ingresa su sueldo entre 950 y 3000 (valor entero) : ");
                                    bdPersonas[i][j] = sn.nextInt();
                                }
                            }
                        }
                        break;
                    default:
                        System.out.print(" Error en el sistema ");
                        break;

                }
            }
        }
    }

    public static void menu() {
        System.out.println("  Menu ");
        System.out.println("1. Ingresar Personas");
        System.out.println("2. Porcentaje de hombres (tengan o no trabajo)");
        System.out.println("3. Porcentaje de mujeres (tengan o no trabajo)");
        System.out.println("4. Porcentaje de hombres que trabajan");
        System.out.println("5. Porcentaje de mujeres que trabajan");
        System.out.println("6. El sueldo promedio de las hombres que trabajan");
        System.out.println("7. EL sueldo promedio de las mujeres que trabajan");
        System.out.println("8. Salir");
    }

    // Porcentaje de hombres (tengan o no trabajo).
    public static double porHombres(int[][] bdPersonas) {
        double Por = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][j] == 1) {
                    Por++;
                }
            }
        }
        Por = (100 * Por) / 8;
        return Por;
    }

    // Porcentaje de mujeres (tengan o no trabajo).
    public static double porMujer(int[][] bdPersonas) {
        double Por = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][j] == 2) {
                    Por++;
                }
            }
        }
        Por = (100 * Por) / 8;
        return Por;
    }

    // Porcentaje de hombres que trabajan
    public static double porHombresTrabajan(int[][] bdPersonas) {
        int numero = 0;
        double trabajo = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][0] == 1) {
                    numero++;
                    if (j == 0 && bdPersonas[i][1] == 1) {
                        trabajo++;
                    }
                }
            }
        }
        trabajo = (100 * trabajo) / numero;
        return trabajo;
    }

    // ) Porcentaje de mujeres que trabajan
    public static double porMujeresTrabajan(int[][] bdPersonas) {
        int numero = 0;
        double trabajo = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][0] == 2) {
                    numero++;
                    System.out.println(" numero " + numero);
                    if (j == 0 && bdPersonas[i][1] == 1) {
                        trabajo++;
                    }
                }
            }
        }
        trabajo = (100 * trabajo) / numero;
        return trabajo;
    }

    // Promedio de sueldo de Hombres que trabajan
    public static double PsueldoHombres(int[][] bdPersonas) {
        int numero = 0;
        double promedio = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][0] == 1) {
                    System.out.println(" numero " + numero);
                    if (j == 0 && bdPersonas[i][1] == 1) {
                        promedio = promedio + bdPersonas[i][2];
                        numero++;
                    }
                }
            }
        }
        System.out.println(" numero " + promedio);

        promedio = promedio / numero;
        return promedio;
    }

    // Promedio de sueldo de Mujeres que trabajan
    public static double PsueldoMujeres(int[][] bdPersonas) {
        int numero = 0;
        double promedio = 0;
        for (int i = 0; i < bdPersonas.length; i++) {
            for (int j = 0; j < bdPersonas[0].length; j++) {
                if (j == 0 && bdPersonas[i][0] == 1) {
                    System.out.println(" numero " + numero);
                    if (j == 0 && bdPersonas[i][1] == 1) {
                        promedio = promedio + bdPersonas[i][2];
                        numero++;
                    }
                }
            }
        }
        System.out.println(" numero " + promedio);
        promedio = promedio / numero;
        return promedio;
    }
}
