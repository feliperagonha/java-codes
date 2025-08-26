// Faça um programa que conte os números até 0 (Digitado pelo usuário)

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        System.out.print("Digite números inteiros (0 para encerrar): ");
        int number;

        do {
            System.out.print("Digite um número: ");
            number = scanner.nextInt();
            count += number;

        } while(number > 0);

        System.out.print("Soma total: " + count);

    }
}
