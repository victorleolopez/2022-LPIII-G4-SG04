import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    protected int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    protected int[] diasAcumulados = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
    protected int[] diasAcumuladosEnBisiesto = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };

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

    public String Semanadia() {
        String[] dias = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
        String diaDeLaSemana = dias[this.diasTranscurridos() % 7];
        return diaDeLaSemana;
    }

    public String larga() {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        String formato = String.format("%s %d de %s de %d", this.Semanadia(), this.dia, meses[this.mes - 1], this.año);
        return formato;
    }

    public boolean fechaTras(long dias) {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
        while (dias > 0) {
            this.siguiente();
            dias--;
        }
        return false;
    }

    public int diasEntre(Fecha fecha) {
        return Math.abs(this.diferenciaEntreFechas(fecha));
    }

    public void siguiente() {
        if (this.dia == diasMes(this.mes)) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.año++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    public void anterior() {
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.dia = 31;
                this.mes = 12;
                this.año--;
            } else {
                this.dia = 31;
                this.mes--;
            }
        } else {
            this.dia--;
        }
    }

    public Fecha copia() {
        return new Fecha(this.año, this.mes, this.dia);
    }

    private int diferenciaEntreFechas(Fecha fecha) {
        int diferencia1 = diferenciaDelOrigen(fecha.dia, fecha.mes, fecha.año);
        int diferencia2 = diferenciaDelOrigen(this.dia, this.mes, this.año);
        return diferencia2 - diferencia1;
    }

    public boolean igualQue(Fecha fecha) {
        return (this.año == fecha.año && this.mes == fecha.mes && this.dia == fecha.dia);
    }

    public boolean menorQue(Fecha fecha) {
        return this.diferenciaEntreFechas(fecha) < 0;
    }

    public boolean mayorQue(Fecha fecha) {
        return this.diferenciaEntreFechas(fecha) > 0;
    }

    private int diferenciaDelOrigen(int dia, int mes, int ano) {
        int dias;
        if (this.Bisiesto()) {
            ano--;
            int anosBisiestos = ano / 4 - ano / 100 + ano / 400;
            dias = ano * 365 + anosBisiestos + diasAcumuladosEnBisiesto[mes - 1] + dia - 1;
        } else {
            ano--;
            int anosBisiestos = ano / 4 - ano / 100 + ano / 400;
            dias = ano * 365 + anosBisiestos + diasAcumulados[mes - 1] + dia - 1;
        }
        return dias;
    }
}
