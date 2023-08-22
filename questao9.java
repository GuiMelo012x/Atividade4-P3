import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        // Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa, dado o peso e a altura.
        // Em seguida, exiba se a pessoa está abaixo do peso, com peso normal, com sobrepeso, obesa ou muito obesa.
        Scanner sc = new Scanner(System.in);
        double pesoKG = sc.nextDouble();
        double alturaMetros = sc.nextDouble();
        double IMC = pesoKG/(alturaMetros*alturaMetros);
        if(IMC < 18.5){
            System.out.printf("IMC %.2f : Abaixo do Peso.", IMC);
        }
        if(IMC >= 18.5 && IMC <= 24.99){
            System.out.printf("IMC %.2f : Normal.", IMC);
        }
        if(IMC >= 25 && IMC <= 29.99){
            System.out.printf("IMC %.2f : Sobrepeso.", IMC);
        }
        if(IMC >= 30 && IMC <= 34.99){
            System.out.printf("IMC %.2f : Obesidade.", IMC);
        }
        if(IMC >= 35){
            System.out.printf("IMC %.2f : Obesidade Grave.", IMC);
        }
    }
}