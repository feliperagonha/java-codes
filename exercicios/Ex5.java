// Exercício 5 - Utilização de Loops(While)
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: "); 
        int number = scanner.nextInt(); // input

        int count = 1;
        System.out.println("Counting from 1 to " + number + ":"); 

        while(count <= number) { // Enquanto 1 for menor que o Número contará += 1
            System.out.println(count);
            count++;
        }
        scanner.close(); // Fecha o scanner (boa prática)
    }  
}
