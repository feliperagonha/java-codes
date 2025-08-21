// Faça um programa que faça a tabuada de um número digitado pelo usuário.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the number for the multiplication table: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int result = i*number;
            System.out.println(number+" x "+i+" = "+result);
        }
        scanner.close();
    }
    
}
