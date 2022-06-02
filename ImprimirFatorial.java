
 public class ImprimirFatorial {
     
   public static void main (String[] args){
       int fatorial = 1;
       int n = 0;
       int fim = 10;
       for (n = 1; n <= fim; n++){
           fatorial = fatorial * n;
           System.out.println(fatorial);
       }
    }
    
}