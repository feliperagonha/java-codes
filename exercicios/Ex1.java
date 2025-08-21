 // Exercício 1 - OPERAÇÕES utilizando números inteiros

public class Ex1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int soma = a + b;
        int multiplicacao = a * b;
        int divisao = b / a; // para não ser 0
        int subtracao = a - b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Resto: " + resto);
    }
}