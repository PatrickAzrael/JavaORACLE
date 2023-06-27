package Section6.Problema2;

import java.util.Scanner;

public class DisplayMultiples {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.err.println("Informe um número inteiro: ");
    int multiplos = leia.nextInt();
    int resultado;
    for (int i = 1; i <= 12; i++) {
      resultado = multiplos * i;
      System.out.println(resultado);
    }

    leia.close();
  }
}
