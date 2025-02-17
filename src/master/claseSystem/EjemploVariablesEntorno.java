package master.claseSystem;

import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();

        System.out.println("Variables de entorno del sistema" + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        // Path debe ser escrita con minusculas para que funcione ya que es case sensitive cuando se trata de variables de entorno por medio de mapeo de variables de entorno
        String data = varEnv.get("Path");
        System.out.println("data = " + data);
        
        //En windows para agregar una variable de entorno se puede hacer con el comando setx SALUDAR_HOLA "Hola desde variable de entorno"
        //En linux o mac se puede hacer con export SALUDAR_HOLA="Hola desde variable de entorno"
        //Para borrar una variable de entorno en windows se puede hacer con el comando setx SALUDAR_HOLA ""
        //Para borrar una variable de entorno en linux o mac se puede hacer con el comando unset SALUDAR_HOLA
        String miApp = varEnv.get("SALUDAR_HOLA");
        System.out.println("miApp = " + miApp);
    }
}
