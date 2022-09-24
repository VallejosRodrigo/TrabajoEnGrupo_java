package clases;
import interfaces.IInformacion;

public class Facultad implements IInformacion {
    //atributos internos
    private String nombre;


    @Override //sobre escritura de la interface IInformacion
    public int verCantidad() {
        return 0;
    }
}
