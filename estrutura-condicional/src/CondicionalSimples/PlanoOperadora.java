public class PlanoOperadora {

    /*
     * Imagina que fomos requisitados a criar um sistema de plano telefonico onde:
     * 
     * - O Sistema terá 03 Planos: BASIC, MIDIA, TURBO
     * BASIC: 100 Minutos de ligação
     * MIDIA: 100 Minutos de ligação + Whats e Instagram grátis
     * TURBO: 100 Minutos de ligação + Whats e Instagram grátis + 5Gb de Youtube
     * 
     */

    public static void main(String[] args) {
        String plano = "M"; 

        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube");
                break;
            }
            case "M":{   
                System.out.println("Whats e Instagram grátis"); 
                break;
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
        
        /*
         * Se optar por utilizar o switch / case estudar sobre:
         * continue, break e default
         */
        }
    }
}
