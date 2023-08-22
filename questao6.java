import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        //Crie um programa que receba o nome de duas pessoas e exiba qual delas possui o maior número de caracteres em seu nome.
        Scanner sc = new Scanner(System.in);
        String nome1 = sc.next();
        String nome2 = sc.next();
        String[] qt1 = nome1.split("");
        String[] qt2 = nome2.split("");
        if(nome1.length() == nome2.length()){
            System.out.println("Os nomes têm a mesma quantidade de caracteres, " + nome1.length());
        }
        else if (nome1.length() > nome2.length()){
            System.out.println(nome1 + " é maior, pois possui " + nome1.length() + " caracteres, e " + nome2 + " possui " + nome2.length() + ".");
        }else
            System.out.println(nome2 + " é maior, porque possui " + nome2.length() + " caracteres, e " + nome1 + " possui " + nome1.length() + ".");
    }
}