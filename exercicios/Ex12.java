/*Cinco eleitores demoraram, respectivamente, 3min 38s, 3min 18s, 2min 46s,
2min 57s e 3min 26s para votar. Qual foi a média, em segundos e em minutos dos tempos de
votação desses eleitores?*/


public class Ex12 {
    public static void main(String[] args) {
      int a = 3*60+38;
      int b = 3*60+18;
      int c = 2*60+46;
      int d = 2*60+57;
      int e = 3*60+26;

      int media_segundos = (a + b + c + d + e) / 5;
      double media_minutos = media_segundos / 60;

      System.out.println("Média em segundos: "+media_segundos);
      System.out.println("Média em minutos: "+media_minutos);


    
    }
}
