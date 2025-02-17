package master.valor_vs_referencia;

public class PasaArgumentoPorReferenciaObjeto_03 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println("persona antes de modificar = " + persona.getNombre());
        persona.cambiarNombre("Carlos");
        System.out.println("persona después de modificar = " + persona.getNombre());
        //Las variables que se pasan por referencia son los objetos a diferencia de las variables primitivas
    }
}
