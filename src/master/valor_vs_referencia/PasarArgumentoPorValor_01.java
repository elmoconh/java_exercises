package master.valor_vs_referencia;

public class PasarArgumentoPorValor_01 {
    public static void main(String[] args) {
        int i = 10;
        //La variables primitivas siempre se pasan por valor y no por referencia por que no es un objeto
        System.out.println("Valor de i antes de llamar al método: " + i);
        test(i);
        System.out.println("Valor de i después de llamar al método: " + i);
        
    }
    public static void test(int i){
        System.out.println("Valor de i dentro del método: " + i);
        i = 35;
        System.out.println("Valor de i después de modificarlo dentro del método: " + i);
    }
}
