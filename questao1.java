import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        // Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou igual a zero.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 0){
            System.out.println("O número é " + N );
        }
        if(N > 0){
            System.out.println(N + " é positivo");
        }
        if(0 > N){
            System.out.println(N + " é negativo");
        }
    }
}

