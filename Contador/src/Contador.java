import java.util.InputMismatchException;
import java.util.Scanner;



public class Contador {
    
    public static void main(String[] args) throws ParamentrosInvalidosException {
        Scanner ler = new Scanner(System.in);
        
        
        try {
        System.out.println("Informe o primero parâmetro: ");
        int parametroUm = ler.nextInt();
        System.out.println("Iforme o segundo parâmetro: ");
        int parametroDois = ler.nextInt();
        contar(parametroUm, parametroDois);

            
        } catch (UnsupportedOperationException exception ) {   
           System.out.println("O segundo parâmetro deve ser maior que o primeiro! Tente Novamente.");
        } catch (final InputMismatchException exception) {
            System.out.println("AMBOS OS PARÂMETROS DEVEM SER NÚMERICOS! Tente Novamente. ");
        }
        
    
    }

    public static void contar(int parametroUm, int parametroDois) throws ParamentrosInvalidosException, InputMismatchException{
       
         if (parametroDois > parametroUm) { 
        int contagem = parametroDois - parametroUm;
        for ( int count = 0; contagem > count; count ++)
        
        System.out.println("Imprimindo o núemro: " + (count + 1)  );
        
        } else
        throw new UnsupportedOperationException();
    }
}
    