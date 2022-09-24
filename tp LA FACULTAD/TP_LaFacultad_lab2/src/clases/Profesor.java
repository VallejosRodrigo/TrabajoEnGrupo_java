package clases;
import clasesAbstractas.Persona;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    public Profesor(double basico, int antiguedad) {
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos() {

    }

}
