public class ResultadoEscolarEncadeado {
    
    public static void main(String[] args) {
        
        /*
         * Em um controle de fluxo condicional, nem sempre nos limitamos ao se ( if )  e senão ( else ), poderemos ter uma terceira
         * quarta e ou inumeras condições. 
         */

         int nota = 3;

         if(nota >= 7)
            System.out.println(" Aprovado! ");
         
            else if ( nota >= 5 && nota < 7 )
            System.out.println(" Prova de Recuperação ");

            else 
            System.out.println(" Reprovado! ");

    }

}
