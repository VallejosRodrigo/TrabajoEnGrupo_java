package clases;
import clasesAbstractas.Persona;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    //constructores
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    //getter and setters
    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override //metodo que hereda de persona
    public void modificarDatos() {

    }

}
