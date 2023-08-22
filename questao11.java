import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        // Desenvolva um programa que leia o salário de um funcionário e calcule o valor do seu aumento.
        // Para salários superiores a R$ 1.500,00, o aumento deve ser de 10%. Caso contrário, o aumento é de 15%.
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario >= 1500){
            System.out.printf("%.2f",salario * 1.1);
        }else
            System.out.printf("%2.f",salario * 1.15);
    }
}