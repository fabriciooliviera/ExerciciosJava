public class Populacao{
    public static void main (String[] args){
        Integer anos = Integer.valueOf(args[0]);
        Long pessoas = 7000000000L;
        Double porc = 0.012;

        

        Double total = pessoas.doubleValue();
        for (int i = 0; i < anos; i++){
            total = total + (total * porc); 
        }

        System.out.println(Math.round(total) + " pessoas"); 
    }

}
