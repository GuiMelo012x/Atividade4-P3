import java.util.Scanner;
public class questao16 {
    public static void main(String[] args) {
        // Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo usando a estrutura de controle try/catch para tratar exceções.
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        try{
            int inteiro = (int) n;
            int arredondado = Math.round(inteiro);
            System.out.println("O numero arredondado é " + arredondado);
        }catch (Exception e){
            System.out.println("Erro.");
        }
    }
}