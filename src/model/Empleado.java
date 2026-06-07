package model;

/**
 *  Representa a un empleado en la Agencia, puede tener distintas ocupaciones.
 *  Hereda de Persona sus métodos y atributos (nombre, edad, dirección y contacto).
 *
 *  Atributo propio: sueldo (que recibe el empleado)
 */
public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, int edad,
                    String calle, String sector, String ciudad,
                    String numeroTelefono, String correoElectronico,
                    double sueldo) {

        //  Palabra clave que llama al constructor de la clase padre (superclase)
        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            System.err.println("El sueldo no puede ser un número negativo o cero.");
        }
    }

    /**
     *  Método que sobrescribe a setEdad() en clase Persona
     *  para validar si el empleado es mayor de edad y puede trabajar.
     *  (En esta agencia es obligatorio ser mayor de edad)
     *
     * @param edad Edad del empleado
     */
    @Override
    public void setEdad(int edad) {
        if (edad >= 18) {
            super.setEdad(edad);
        } else {
            System.err.println("Un empleado no puede ser menor de edad.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado en la Agencia. Sueldo: " + sueldo + "\n";
    }
}
