package model;

/**
 *  Representa a una persona de la Agencia como un Empleado (o Cliente para futuras versiones).
 *
 *  Aplica composición con Direccion y Contacto (en caso de que
 *  se elimine a un objeto 'persona' del sistema, no tiene sentido
 *  conservar su dirección e información de contacto).
 *
 *  Además de direccion y contacto, sus atributos son nombre y edad.
 *
 */
public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    // --------------------------
    private Direccion direccion;                // Integración de clases Direccion
    private Contacto contacto;                  //  y Contacto como atributos
    // --------------------------

    public Persona(String nombre, int edad,
                   String calle, String sector, String ciudad,
                   String numeroTelefono, String correoElectronico) {

        this.nombre = nombre;
        this.edad = edad;
        // ------------------
        this.direccion = new Direccion(calle, sector, ciudad);               // Composición: se crea el objeto dentro
        this.contacto = new Contacto(numeroTelefono, correoElectronico);     //  de la clase
        // ------------------
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    /**
     *  Método para validar que la persona tenga una edad real
     *  (considera recién nacidos y menores de un año).
     *
     * @param edad Edad de la persona
     */
    public void setEdad(int edad) {
        if(edad >= 0) {
            this.edad = edad;
        } else {
            System.err.println("La edad debe ser mayor o igual a cero.");
        }
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad +
                "\nDirección: " + direccion + "\n" + contacto + "\n";
    }
}
