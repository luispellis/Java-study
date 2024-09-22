public class CaixaELetronico {

    /*
     * A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executados quando determinadas
     * condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.s
     */

    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("Novo Saldo: " + saldo);
        }else 
            System.out.println(" Saldo Insuficiente");
        
    }
    
}
