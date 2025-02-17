package master.valor_vs_referencia;

public class PasarArgumentoPorReferencia_02 {
    public static void main(String[] args) {
        int[] edad =  {10, 11 , 12};
        //Las variables que se pasan por referencia son los objetos a diferencia de las variables primitivas
        System.out.println("Valor de i antes de llamar al método: ");
        for(int valor: edad){
            System.out.println(valor);
        }

        test(edad);
        System.out.println("Valor de i después de llamar al método: ");
        for(int valor: edad){
            System.out.println(valor);
        }

    }
    public static void test(int[] edadArr){
        System.out.println("Valor de i dentro del método: ");
        for(int valor: edadArr){
            System.out.println(valor);
        }
        edadArr[0] = 35;
        System.out.println("Valor de i después de modificarlo dentro del método: " );
        for(int valor: edadArr){
            System.out.println(valor);
        }
    }
}
