// Faça um programa que o usuário digite um número e imprima o fatorial desse número
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the number for the factorial: ");
        int number = scanner.nextInt();
        int factorial = 1;

        for(int i = number; i >= 1; i--) {
            factorial *= i;  // factorial = factorial * i
            if(i > 1){ 
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = ");
            }
    
        }

        System.out.println(factorial);
        scanner.close();
    }
    
}
