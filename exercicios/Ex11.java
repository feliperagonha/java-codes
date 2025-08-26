// Faça um programa que o usuário digite números inteiros (0 para encerrar)
// No final deve imprimir o menor e maior número digitado pelo usuário

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa iniciando, digite 0 para encerrar.");
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int numero;

        while(true){
            System.out.print(" Digite um número: ");
            numero = scanner.nextInt();
            if(numero == 0){
                break;
            }
            if(menor > numero){
                menor = numero;
            }
            if(maior < numero){
                maior = numero;
            }
        }
        

        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);

    }
    
}
