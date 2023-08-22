import java.util.Scanner;
public class questao14 {
    public static void main(String[] args) {
        //  Elabore um programa que leia um número inteiro de 1 a 5 e exiba a mensagem
        //  "Muito bom", "Bom", "Regular", "Insuficiente" ou "Muito insuficiente", de acordo com o valor lido, utilizando switch/case.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Muito Insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Regular.");
                break;
            case 4:
                System.out.println("Bom.");
                break;
            case 5:
                System.out.println("Muito Bom.");
                break;
        }
    }
}