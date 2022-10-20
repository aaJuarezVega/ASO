public class Profesor extends Persona {

    private String materia;
    private String salon;

    public Profesor(String materia, String salon) {
        this.materia = materia;
        this.salon = salon;
    }

    public Profesor(String nombre, String aPaterno, String aMaterno, String materia, String salon) {
        super(nombre, aPaterno, aMaterno);
        this.materia = materia;
        this.salon = salon;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("materia = " + materia);
        System.out.println("salon = " + salon);
    }

   /* @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                ", salon='" + salon + '\'' +
                '}';
    }*/
}
