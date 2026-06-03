package model;

/**
 *  Representa a un empleado en la Agencia, puede tener varios roles.
 *  Hereda de Persona (nombre, edad, dirección y contacto)
 *  Atributo propio: sueldo
 */
public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, int edad,
                    String calle, String sector, String ciudad,
                    String numeroTelefono, String correoElectronico,
                    double sueldo) {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado en la Agencia.\nSueldo: " + sueldo + "\n";
    }
}
