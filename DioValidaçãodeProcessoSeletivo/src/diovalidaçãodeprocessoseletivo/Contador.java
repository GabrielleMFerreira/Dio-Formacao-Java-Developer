import diovalidaçãodeprocessoseletivo.ParametrosInvalidosExceptions;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor:");
        int parametroUm = terminal.nextInt();
        System.out.println("Entre com o segundo valor:");
        int parametroDois = terminal.nextInt();
        contar(parametroUm,parametroDois);
     
        if(parametroDois<parametroUm)
        try {
            if(parametroUm>parametroDois)
            	throw new ParametrosInvalidosExceptions();
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions{
        int contagem = parametroDois - parametroUm;
        System.out.println("O total de números é: "  + contagem + ".");
        for(int i=0; i<=contagem; i++){
            System.out.println("O valor "+i+ " é: " + (parametroUm+i));
        }

    }
}
