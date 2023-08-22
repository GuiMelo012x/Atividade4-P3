import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        // Desenvolva um programa que leia dois números inteiros e mostre qual deles é o maior, ou se são iguais.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }
        else if(n2 > n1)
            System.out.println(n2 + " é maior que " + n1);
        else{
            System.out.println("São iguais");
        }
    }
}