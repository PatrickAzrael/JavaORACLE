package Section6.Problema1;

import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String pin = "P190S";
        System.out.println("Digite o PIN: ");
        String acesso = leia.nextLine();

        while (!acesso.equals(pin)) {
            System.out.println("O pin incorreto.");
            acesso = leia.nextLine();
        }
        System.out.println("O pin correto foi inserido, agora você possui acesso à conta.");

        leia.close();
    }

}