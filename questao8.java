import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        // Faça um programa que receba três números e os imprima em ordem crescente.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int menor = 0;
        int meio = 0;
        int maior = 0;
        if (n1 < n2 && n1 < n3) {
            menor = n1;
            if (n2 > n3) {
                maior = n2;
                meio = n3;
            } else
                maior = n3;
            meio = n2;
        }
        if (n2 < n1 && n2 < n3) {
            menor = n2;
            if (n1 > n3) {
                maior = n1;
                meio = n3;
            }
            if (n3 > n1) {
                maior = n3;
                meio = n1;
            }
        }
        if (n3 < n1 && n3 < n2) {
            menor = n3;
            if (n1 > n2) {
                maior = n1;
                meio = n2;
            }
            if (n2 > n1) {
                maior = n2;
                meio = n1;
            }
        }
        System.out.println(menor + " " + meio + " " + maior);
    }
}
