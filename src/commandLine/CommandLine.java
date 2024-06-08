package commandLine;

public class CommandLine {
    public static void main(String[] args) {
        if(args.length == 0){
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++ ){
            System.out.println("mostrando argumento nro "+ i+" "+args[i]);
        }
    }
}
