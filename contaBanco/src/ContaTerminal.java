import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    
   
    /**
     * @param args
     */
    public static  void main(String[] args) {
        
            
            int Numero = Integer.valueOf (args[1]);
            String Agencia = args [0];
            String nomeCliente = args [2];
            double Saldo = Double.valueOf(args[3]);
          //trazer os dados do cliente
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); {

            System.out.println("Por favor, digite o número da Agencia");
            Agencia = scanner.next();

            System.out.println("Usuario");
            Numero = scanner.nextInt();

        



            System.out.println("Olá " + nomeCliente);
            System.out.println("obrigado por criar uma conta em nosso banco, sua agêcia é " + Agencia);
            System.out.println("conta " + Numero);
            System.out.println("é seu saldo " + Saldo + " já está disponivel para saque ");
        }

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        

    }

}            