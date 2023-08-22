import java.util.Scanner;
public class questao12 {
    public static void main(String[] args) {
        // Receba um número inteiro do usuário e verifique se ele é divisível por 3 e por 5 ao mesmo tempo,
        // exibindo uma mensagem apropriada.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3 == 0 && num%5==0){
            System.out.println(num + " é divisível por ambos 3 e 5.");
        }else
            System.out.println(num + " não é divisível nem por 3 e nem por 5.");
    }
}