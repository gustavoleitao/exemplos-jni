
public class Calculadora {

    static {
        System.loadLibrary("calculadora");
    }

    public native int soma(int a, int b);

    public static void main(String args[]){

        if (args.length < 2){
            System.out.println("Você deve passar dois parâmetors para executar a soma.");
            System.exit(-1);
        }

        var op1 = Integer.parseInt(args[0]);
        var op2 = Integer.parseInt(args[1]);

        var calculadora = new Calculadora();
        int resultado = calculadora.soma(op1,op2);
        System.out.println("O resultado da soma é: "+resultado);
    }

}