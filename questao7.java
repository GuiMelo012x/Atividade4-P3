import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        // Desenvolva um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.
        Scanner sc = new Scanner(System.in);
        String caractere = sc.next();
        char letra = caractere.charAt(0);
        if(caractere.charAt(0) == 'A' || caractere.charAt(0) == 'E' || caractere.charAt(0) == 'I' || caractere.charAt(0) == 'O' || caractere.charAt(0) == 'U'){
            System.out.println(caractere.charAt(0) + " é vogal");
        }else
            System.out.println(caractere.charAt(0) + " é consoante");
    }
}