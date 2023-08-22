import java.util.Scanner;
public class questao21 {
    public static void main(String[] args) {
        // Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
        // quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos.
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Centimetros, 2 - Milímetros, 3 - Quilômetros");
        int n = sc.nextInt();
        double metros = sc.nextDouble();
        switch (n){
            case 1:
                double centimetros = metros * 100;
                System.out.println(centimetros + " cm");
                break;
            case 2:
                double milimeteros = metros * 1000;
                System.out.println(milimeteros + " mm");
                break;
            case 3:
                double quilometros = metros / 1000;
                System.out.println(quilometros + " km");
                break;
            default:
                System.out.println("Erro.");
                break;
        }
    }
}