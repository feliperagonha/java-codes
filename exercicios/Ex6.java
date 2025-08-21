// Faça um programa que o usuário digite um número e faça uma contagem com esse número. (While)

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number to start a countdown: ");
        int start_number = scanner.nextInt();

        System.out.print("Countdown:");

        while(start_number > 0) { // Enquanto for maior que 0 vai printando e diminuindo 1
            System.out.println("In "+start_number+"...");
            start_number--; // Decrementa
        }
        System.out.println("GO!");
        scanner.close(); // Scanner fechando

    }
    
}
