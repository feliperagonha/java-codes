// Faça um programa utilizando for para uma contagem. O valor deve ser inserido pelo usuário

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Sintaxe para o input

        System.out.print("Type a number: ");
        int number = scanner.nextInt(); // Variável do scanner

        System.out.print("Counting with for: ");

        for(int i = 1; i <= number; i++) { // Começa no 1 - Até for igual o número digitado.
            System.out.println(i);
        }

        scanner.close();
    }
    
}
