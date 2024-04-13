import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numeroDia;
    String nomeDia = ""; //para versionar no github joaoargentin


    System.out.println("Digite o número do dia da semana: ");
    numeroDia = sc.nextInt();

    if (numeroDia > 7) {
        System.out.println("Esse dia não existe");
    }

    nomeDia = switch (numeroDia) {
        case 1 -> "Domingo";
        case 2 -> "Segunda";
        case 3 -> "Terça";
        case 4 -> "Quarta";
        case 5 -> "Quinta";
        case 6 -> "Sexta";
        case 7 -> "Sábado";
        default -> nomeDia;
    };

    System.out.println(STR."Dia da semana é: \{nomeDia}");


    sc.close();


}