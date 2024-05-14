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
           System.out.println("O segundo parâmetro deve ser maior que o primeiro! Tente Novamente");
        }
        
    
    }

    public static void contar(int parametroUm, int parametroDois) throws ParamentrosInvalidosException {
       
         if (parametroDois > parametroUm) { 
        int contagem = parametroDois - parametroUm;
        for ( int count = 0; contagem > count; count ++)
        
        System.out.println("Imprimindo o núemro: " + (count + 1)  );
        
        } else
        throw new UnsupportedOperationException();
    }
}
    