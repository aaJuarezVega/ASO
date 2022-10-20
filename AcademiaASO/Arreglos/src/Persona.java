import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;

    private List<Factura> facturas = new ArrayList<>();


    public Persona() {
    }

    public Persona(String nombre, String aPaterno, String aMaterno) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public void addFactura(Factura f){
        facturas.add(f);
    }

    public void addFactura(Factura... variasFacturas){
        for (Factura f: variasFacturas) {
            facturas.add(f);
        }
    }

    public void addFactura(float a,  Factura... variasFacturas){
        Collections.addAll(facturas, variasFacturas);

    }

    public void mostrarFacturas(){

        for (int i = 0; i < facturas.size(); i++) {

                System.out.println("variasFacturas = " + facturas.get(i).getNumero());
        }

    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("aPaterno = " + aPaterno);
        System.out.println("aMaterno = " + aMaterno);

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", aPaterno='" + aPaterno + '\'' +
                ", aMaterno='" + aMaterno + '\'' +
                '}';
    }
}