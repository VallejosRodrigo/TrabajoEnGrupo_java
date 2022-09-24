package clasesAbstractas;

public abstract class Persona {
    //atributos
    protected String nombre;
    protected String apellido;
    protected int legajo;

    //constructores
    protected Persona() {  //constructor vacio
    }

    protected Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //getter and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    //metodos abstractos
    public abstract void modificarDatos();


}
