package Section4.problema1;

import java.util.Random;

public class ComputeMethods {
    public double fToC(double grausf) {
        double grausc = 5 * ((grausf - 32) / 9);
        return grausc;
    }

    public double hypotenuse(int a, int b) {
        double hipotenusa = Math.sqrt((a * a) + (b * b));
        return hipotenusa;
    }

    public int roll() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dados = dado1 + dado2;
        return dados;
    }
}
