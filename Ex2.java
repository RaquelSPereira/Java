/*Na empresa em que trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15.000 reais, em fevereiro, 23.000 reais, e, em março, 17.000 reais, faça um programa que calcule e imprima o gasto total no trimestre e a média mensal de gastos.  */
public class Ex2 {
    public static void main (String[] args){
    int jan = 15000;
    int fev = 23000;
    int marc = 17000;
    int despesa = jan + fev + marc;
    System.out.println("O gasto trimestral foi de: " +despesa+ " R$");
    int media = (despesa/3);
    System.out.println("E a média trimestral é R$: " +media);
    }
}