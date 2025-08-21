// Exercício 4 - Verificação de número inteiro.
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your number: ");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("Positive");
        } 
        else if(number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    
}
