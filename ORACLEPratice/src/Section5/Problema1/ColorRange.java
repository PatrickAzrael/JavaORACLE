package Section5.Problema1;

import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o comprimento da onda: ");
        double comprimentoOnda = leia.nextDouble();
        if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
            System.out.println("A cor é Violeta.");
        } else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
            System.out.println("A cor é Azul.");
        } else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
            System.out.println("A cor é Verde.");
        } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            System.out.println("A cor é Amarelo.");
        } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            System.out.println("A cor é Laranja.");
        } else if (comprimentoOnda >= 620 && comprimentoOnda < 750) {
            System.out.println("A cor é Vermelho.");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        leia.close();
    }
}
