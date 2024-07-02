// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {
        // tipo da variavel e Double com o nome Saldo e valorSolicitado com os atributos 25.0 e 17.8
       double saldo = 25.0;
       double valorSolicitado = 17.0;


       // SE e igual a IF como se ler acondição if precisa ser verdadeira
       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        
        //condicional simples
    }
}