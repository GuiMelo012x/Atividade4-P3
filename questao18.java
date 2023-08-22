import java.util.Scanner;
public class questao18 {
    public static void main(String[] args) {
        // Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, exiba uma mensagem informando se é solteiro, casado, divorciado ou viúvo.
        Scanner sc = new Scanner(System.in);
        String estadoC = sc.next().toLowerCase();
        switch (estadoC){
            case "solteiro":
                System.out.println("Solteiro.");
                break;
            case "casado":
                System.out.println("Casado.");
                break;
            case "divorciado":
                System.out.println("Divorciado.");
                break;
            case "viúvo":
                System.out.println("Viúvo.");
                break;
            default:
                System.out.println("Inválido.");
                break;
        }
    }
}