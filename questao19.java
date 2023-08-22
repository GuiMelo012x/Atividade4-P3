import java.util.Scanner;
public class questao19 {
    public static void main(String[] args) {
        // Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado da
        // operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão).
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Soma: insira dois números");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                double soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                System.out.println("Subtração: insira dois números");
                double num3 = sc.nextDouble();
                double num4 = sc.nextDouble();
                double subtraçao = num3 - num4;
                System.out.println(subtraçao);
                break;
            case 3:
                System.out.println("Multiplicação: insira dois números");
                double num5 = sc.nextDouble();
                double num6 = sc.nextDouble();
                double multiplicaçao = num5 * num6;
                System.out.println(multiplicaçao);
                break;
            case 4:
                System.out.println("Divisão: insira dois números");
                double num7 = sc.nextDouble();
                double num8 = sc.nextDouble();
                double divisao = num7/num8;
                System.out.println(divisao);
                break;
        }
    }
}