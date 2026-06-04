package model;

/**
 *  Representa a una persona
 *  Aplica composición con Direccion y Contacto
 *
 */
public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    // ==========================
    private Direccion direccion;                // Integración de clases Direccion
    private Contacto contacto;                  //  y Contacto como atributos
    // ==========================

    public Persona(String nombre, int edad, String calle,
                   String sector, String ciudad,
                   String numeroTelefono, String correoElectronico) {

        this.nombre = nombre;
        this.edad = edad;
        // ==============
        this.direccion = new Direccion(calle, sector, ciudad);
        this.contacto = new Contacto(numeroTelefono, correoElectronico);
        // ==============
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

    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad = edad;
        } else {
            System.err.println("La edad debe ser mayor a cero.");
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
                " | Dirección: " + direccion + "Información de contacto: " + contacto + "\n";
    }
}
