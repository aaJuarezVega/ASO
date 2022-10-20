import java.util.Objects;

public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private String color;

    private Motor motor;
    private Tanque  tanque;

    private Persona conductor;

    private Rueda[] ruedas;
    private int indiceRuedas;
    private TipoAutomovil tipo;

    private static String colorPatente = "Naranja";
    private static int UltimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_VERDE = "Verde";



    public Automovil() {
        this.id = ++UltimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, String color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, String color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }


    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(Rueda rueda){
        this.ruedas[indiceRuedas ++] = rueda;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }



    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        //en un metodo estatico no puede usar this para no generar ambigueda se usa el nombre de la clase
        Automovil.colorPatente = colorPatente;
    }


    public String detalle(){
        String detalle = "Id Instancia :" + this.id +
        "\nauto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo;

        if (this.getTipo() != null){
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\nauto.color = " + this.color +
        "\nauto.cilindrada = " + this.motor.getCilindrada() +
        "\nauto.colorPatente = " + Automovil.colorPatente +
        "\nauto.litrosTanque = " + this.tanque.getCapacidad();

        if (this.conductor != null) {
            detalle += "\nconductor " + this.getModelo() + " es " + this.getConductor();
        }

        if (getRuedas() != null){
            detalle += "\nRuedas del automovil " + this.modelo;
            for (Rueda r: this.getRuedas()){
                detalle += "\n" + r.getFabricante() + ", aro:" + r.getAro() + ", ancho:" + r.getAncho();
            }
        }


        return detalle;
    }

    public String acelerar(int rpm){
        return "\nel auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!!!";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGas){

        return km/(this.tanque.getCapacidad() * porcentajeGas);
    }

    public float calcularConsumo(int km, int porcentajeGas){

        return km/(this.tanque.getCapacidad() * (porcentajeGas/100f));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Automovil automovil = (Automovil) o;

        return id == automovil.id && Objects.equals(fabricante, automovil.fabricante) && Objects.equals(modelo, automovil.modelo);
    }

    @Override
    public String toString() {
        return this.id + " : " + this.fabricante + " : "+  this.modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        //Automovil a = (Automovil) a;
        return this.fabricante.compareTo(a.fabricante);
    }
}
