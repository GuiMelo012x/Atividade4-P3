import java.util.Scanner;
public class questao17 {
    public static void main(String[] args) {
        // Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano), criança (1 a 12 anos),
        // adolescente (13 a 18 anos) ou adulto (mais de 18 anos).
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade >= 0 && idade <= 1){
            System.out.println("É um bebê.");
        } else if(idade > 1 && idade <= 12){
            System.out.println("É uma criança.");
        } else if(idade >= 13 && idade <= 18){
            System.out.println("É um adolescente");
        } else if(idade >= 19 && idade < 130) {
            System.out.println("É um adulto.");
        }else
            System.out.println("Idade inválida");
    }
}