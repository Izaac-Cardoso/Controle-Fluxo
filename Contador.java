
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        
        System.out.print("Digite o 1° número: ");
        int parametro1 = terminal.nextInt();

        System.out.print("Digite o 2° número: ");
        int parametro2 = terminal.nextInt();
        terminal.close();

        try {
          contar(parametro1, parametro2);            
        } catch(ParametrosInvalidosException exception) {
          System.out.println("O segundo número deve ser maior que o primeiro.");
        }        
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException  {
        if(parametro1 < parametro2) {
            int contagem = parametro2 - parametro1;
            for(int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }        
    }
    
}
