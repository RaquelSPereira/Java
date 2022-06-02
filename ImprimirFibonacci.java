public class ImprimirFibonacci {
    public static void main (String[] args){
        int atual = 1;
        int anterior = 0;
        int proximo = 0;
        int limite = 100;
        while(atual < limite){
            System.out.println(atual);
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println(atual);
    }
}
    

