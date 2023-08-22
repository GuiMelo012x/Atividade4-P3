import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        // Faça um programa que verifique se um número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0) {
            System.out.println("O número digitado é zero.");
        }
        else if(N%2 == 0) {
            System.out.println(N + " é par.");
        }else
            System.out.println(N + " é impar.");
    }
}