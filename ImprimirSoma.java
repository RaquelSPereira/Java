public class ImprimirSoma {
    public static void main (String[] args){
        int i = 1;
        int soma = 0;
        int f = 100;
        while(i <= f){
            soma = soma + i;
            i = i + 1;
        }
        System.out.println(soma);
    }
}
