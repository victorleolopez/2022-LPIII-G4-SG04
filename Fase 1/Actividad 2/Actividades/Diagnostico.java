public class Diagnostico {

    public static String aptoVacunaA(Perro P) {
        if (P.getTemp() > 36 && P.getTemp() < 41 && P.getEdad() > 1 && P.peso > 5)
            return "SANO";
        else
            return "ENFERMO";
    }

    public static String aptoVacunaB(Perro P) {
        if (P.getTemp() > 36 && P.getTemp() < 41 && P.getEdad() > 1 && P.peso > 5)
            return "SANO";
        else
            return "ENFERMO";
    }
}
