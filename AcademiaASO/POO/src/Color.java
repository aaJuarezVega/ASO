public enum Color {
    ROJO("Rojo"),
    BLANCO("Blanco"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    GRIS("Gris"),
    NARANJO("Naranjo");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;

    }
}
