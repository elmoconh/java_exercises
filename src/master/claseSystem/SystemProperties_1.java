package master.claseSystem;

import java.util.Properties;

public class SystemProperties_1 {
//obteniendo los datos del sistema operativo
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("userHome = " + userHome);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator(); //es lo mismo que la linea anterior pero mas corto
        System.out.println("lineSeparator = " + lineSeparator + "a" + lineSeparator + "b");
        System.out.println("lineSeparator2 = " + lineSeparator2 + "a" + lineSeparator2 + "b");

        Properties p = System.getProperties();
        //con esto podemos ver todas las propiedades del sistema
        p.list(System.out);
    }
}
