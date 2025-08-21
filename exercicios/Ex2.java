// Exercício de operações utilizando input
import java.util.Scanner; 

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Type the second number: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);

    }
}
