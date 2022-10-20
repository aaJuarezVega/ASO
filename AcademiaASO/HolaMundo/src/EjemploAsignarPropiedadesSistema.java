import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personaliza","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            //System.getProperties().list(System.out);
            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(....) = " + ps.getProperty("mi.propiedad.personaliza"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));


            ps.list(System.out);


        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("no exite el archivo =" + e);
        }


    }
}
