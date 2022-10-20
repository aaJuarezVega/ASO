public enum TipoAutomovil {

    SEDAN("Sedan", "mediano", 4),
    STATION_WAGON("Station Wagon", "grande", 5),
    HATCHBACK("Hatchback", "compacto", 5),
    PICKUP("Pick up", "Camioneta", 4),
    COUPE("Coupé", "pequeño", 2),
    CONVERTIBLE("Convertible", "Deportivo",2),
    FURGON("Furgón", "Utilitario", 4),

    SUV ("SUV", "Automovil Deportivo", 5);

    private final String nombre;
    private final int numeroPueta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPueta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPueta = numeroPueta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPueta() {
        return numeroPueta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
