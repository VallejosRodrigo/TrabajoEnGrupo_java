package clases;
import clasesAbstractas.Persona;

public class Estudiante extends Persona {

    //constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }




    @Override //metodo que hereda de persona
    public void modificarDatos() {

    }
}
