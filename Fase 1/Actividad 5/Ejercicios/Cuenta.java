import java.util.Scanner;

public class Cuenta {
    private int numero;
    private double saldo;
    private char tipoCliente;

    public Cuenta(int numero, double saldo, char tipoCliente) {
        this.numero = numero;
        if (saldo < 50) {
            this.saldo = comprobar(saldo);
        } else
            this.saldo = saldo;
        this.tipoCliente = tipoCliente;
    }

    public Cuenta(int numero, char tipoCliente) {
        this(numero, 50, tipoCliente);
    }

    // setter y getter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        if (saldo < 50)
            this.saldo = comprobar(saldo);
        else
            this.saldo = saldo;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public String toString() {
        // complete con la informacion requerida
        return String.format("No. Cuenta : %s%s\tSaldo :  %.2f", tipoCliente, numero, saldo);
    }

    public void retirar(double Cantidad) {
        if (saldo > 50 && Cantidad <= saldo && Cantidad > 0) {
            saldo = saldo - Cantidad;
            System.out.println("Retiro Completado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double Cantidad) {
        if (Cantidad > 0) {
            saldo = saldo + Cantidad;
            System.out.println("Deposito Completado");
        } else {
            System.out.println("El deposito tiene que ser mayor a cero");
        }
    }

    public double comprobar(double saldos) {
        System.out.print("Ingresar Saldo mayor a 50:");
        Scanner sc = new Scanner(System.in);
        saldos = sc.nextDouble();
        while (saldos < 50) {
            System.out.print("Ingresar Saldo mayor a 50:");
            saldos = sc.nextDouble();
        }
        sc.close();
        return saldos;
    }


}