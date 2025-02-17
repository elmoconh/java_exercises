package master.claseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class AssignSystemProperties_2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            //creamos un objeto de tipo properties
            Properties properties = new Properties(System.getProperties());
            properties.load(file);
            properties.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(properties);

            Properties ps = System.getProperties();

            System.out.println("Propiedad  "+ps.getProperty("config.texto.ambiente"));
            System.out.println("Propiedad  "+ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));

            ps.list(System.out);

        }catch (Exception e){
            System.out.println("No se encontró el archivo "+ e);
        }
    }
}
