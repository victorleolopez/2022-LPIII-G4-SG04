import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor por defecto
    public Fecha() {
        this.dia = 01;
        this.mes = 01;
        this.año = 1900;
        valida();
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }

    // setters y getters
    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAño(int a) {
        año = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fecha: ");
        System.out.println("Ingrese dia (1-31): ");
        dia = sc.nextInt();
        System.out.println("Ingrese mes (1-12): ");
        mes = sc.nextInt();
        System.out.println("Ingrese año (1900-2050) : ");
        año = sc.nextInt();
        valida();
        sc.close();
    }

    public int diasMes(int num) {
        int tdias = 0;
        switch (mes) {
            case 2:
                if (Bisiesto()) {
                    tdias = 29;
                } else {
                    tdias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tdias = 30;
                break;
            default:
                tdias = 31;
        }
        return tdias;
    }

    private boolean Bisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    public boolean valida() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = año >= 1900 && año <= 2050;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (Bisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        if (diaCorrecto && mesCorrecto && añoCorrecto) {
            System.out.println("Fecha introducida: " + corta());
        } else {
            auxiliar();
            System.out.println("Fecha introducida: " + corta());
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    private void auxiliar() {
        dia = 01;
        mes = 01;
        año = 1900;
    }

    public StringBuilder corta() {
        StringBuilder fcorto = new StringBuilder();
        if (dia < 10) {
            fcorto.append("0");
        }
        fcorto.append(dia);
        fcorto.append("-");
        if (mes < 10) {
            fcorto.append("0");
        }
        fcorto.append(mes);
        fcorto.append("-");
        fcorto.append(año);
        return fcorto;
    }

    public int diasTranscurridos() {
        StringBuilder fcorto = new StringBuilder();
        fcorto.append(año);
        fcorto.append("-");
        if (mes < 10) {
            fcorto.append("0");
        }
        fcorto.append(mes);
        fcorto.append("-");
        if (dia < 10) {
            fcorto.append("0");
        }
        fcorto.append(dia);
        LocalDate FeIncial = LocalDate.parse("1900-01-01");
        LocalDate FeFinal = LocalDate.parse(fcorto);
        Duration totaldias = Duration.between(FeIncial.atStartOfDay(), FeFinal.atStartOfDay());
        return (int) totaldias.toDays();
    }

}
