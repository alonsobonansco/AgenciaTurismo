package model;

public class GuiaTuristico extends Empleado {

    private String circuitoTuristico;
    private String idioma;

    public GuiaTuristico(String nombre, int edad,
                         String calle, String sector, String ciudad,
                         String numeroTelefono, String correoElectronico,
                         double sueldo,
                         String circuitoTuristico, String idioma) {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico, sueldo);
        this.circuitoTuristico = circuitoTuristico;
        this.idioma = idioma;
    }

    public String getCircuitoTuristico() {
        return circuitoTuristico;
    }

    public void setCircuitoTuristico(String circuitoTuristico) {
        this.circuitoTuristico = circuitoTuristico;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ocupación: Guía turístico\nCircuito: " + circuitoTuristico +
                " | Idioma: " + idioma + "\n\n";
    }
}
