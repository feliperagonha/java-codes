// Exercício 3 - Condicionais (if/else)

import java.util.Scanner;

public class Ex3 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your age: ");
        int age = scanner.nextInt(); 

        if(age >= 18) { // Verify if is an adult
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        if(age < 13) {
            System.out.println("Children");
        } 
        else if(age < 18) {
            System.out.println("Teenager");
        }
        else if(age < 65) {
            System.out.println("Senior");
        }

        scanner.close();

    }
}
