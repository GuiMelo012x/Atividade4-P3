import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        // Crie um programa que receba a idade de uma pessoa e exiba se ela é maior de idade ou menor de idade.
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if( idade >= 18){
            System.out.println("Você tem " + idade + " anos e é maior de idade.");
        }
        else{
            System.out.println("Você tem "+ idade + " anos e é menor de idade.");
        }
    }
}