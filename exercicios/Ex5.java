// Exercício 5 - Utilização de Loops(While)
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt(); 

        int count = 1;
        System.out.println("Counting from 1 to " + number + ":");

        while(count <= number) {
            System.out.println(count);
            count++;
        }
        scanner.close();
    }  
}
