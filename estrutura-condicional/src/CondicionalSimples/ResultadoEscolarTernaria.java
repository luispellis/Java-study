public class ResultadoEscolarTernaria {

    public static void main(String[] args) {
        
        /*
         * Como vimos em operadores, podemos abreviar nosso algoritmico condicional refatorndo com o conceito de operador ternário
         * Vamos refatorar os exemplos acima para ilustrar o poder deste recurso. 
         */

         int nota = 8;

         String resultado = nota >= 7 ? " Aprovado " : nota >= 5 && nota < 7 ?"Recuperação" : "Reprovado ";
         System.out.println(resultado);


    }
    
}
