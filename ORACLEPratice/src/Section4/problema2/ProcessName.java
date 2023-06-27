package Section4.problema2;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        System.out.println("Digite o seu primeiro nome: ");
        Scanner leia = new Scanner(System.in);
        String nome1 = leia.nextLine();

        System.out.println("Informe o seu último nome: ");
        String nome2 = leia.nextLine();

        char letra1 = nome1.charAt(0);
        System.out.printf("Seu nome é [%s, %c].", nome2, letra1);

        leia.close();
    }
}
