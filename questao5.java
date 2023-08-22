import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        //Elabore um programa que leia três notas de um aluno e calcule a média. Em seguida, exiba se o aluno está aprovado (média maior ou igual a 7) ou reprovado.
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;
        if (media >= 7){
            System.out.printf("O Aluno aprovado com %.1f.", media);
        }else
            System.out.printf("O Aluno ficou com média %.1f e está reprovado.",media);


    }
}