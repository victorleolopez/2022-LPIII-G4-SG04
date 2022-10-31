package bs.bean;

import java.io.Serializable;

public class Empleado implements Serializable {

    private long id;
    private int numero;
    private String nombre;
    private float sueldo;

    public Empleado(long id, int numero, String nombre, float sueldo) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.nombre.toUpperCase();
    }
}
