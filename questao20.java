import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
        // Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o bloco try/catch para
        // garantir que a idade digitada seja um valor inteiro válido.
        Scanner sc = new Scanner(System.in);
        try {
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
        } catch (Exception e) {
            System.out.println("Erro.");
        }
    }
}