package clases;
import interfaces.IInformacion;

public class Facultad implements IInformacion {
    //atributos internos
    private String nombre;


    //implementacion de las interfaces:
    @Override
    public int verCantidad() {
        return 0;
    }
    @Override
    public String listarContenidos() {
        return null;
    }
}
