import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        // Peça ao usuário que insira o dia da semana (por extenso) e, em seguida, exiba uma mensagem
        // informando se é um dia útil ou um fim de semana.
        Scanner sc = new Scanner(System.in);
        String dia = sc.next();
        if(dia.equals("Segunda-feira") || dia.equals("Terça-Feira") || dia.equals("Quarta-Feira") || dia.equals("Quinta-Feira") || dia.equals("Sexta-Feira")){
            System.out.println(dia + " é dia de semana");

        }else if (dia.equals("Segunda") || dia.equals("Terça") || dia.equals("Quarta") || dia.equals("Quinta") || dia.equals("Sexta")){
            System.out.println(dia + " é dia de semana.");

        }else if (dia.equals("Sábado") || dia.equals("Domingo")){
            System.out.println(dia + " é fim de semana.");

        }else
            System.out.println("Não é um dia da semana.");
    }
}