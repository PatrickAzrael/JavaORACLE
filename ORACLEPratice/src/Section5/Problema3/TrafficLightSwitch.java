package Section5.Problema3;

import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a cor atual do semáforo: ");
        int currentcolor = leia.nextInt();

        leia.close();
        switch (currentcolor) {
            case 1:
                if (currentcolor == 1) {
                    System.out.println("Next Traffic Light is green");
                } else if (currentcolor == 3) {
                    System.out.println("Next Traffic Light is red");
                } else {
                    System.out.println("Invalid Color.");
                }
                break;
            case 2:
                if (currentcolor == 2) {
                    System.out.println("Next Traffic Light is yellow");
                }
                break;
            case 3:
                if (currentcolor == 3) {
                    System.out.println("Next Traffic Light is red");
                }
                break;
            case 4:
                if (currentcolor == 4) {
                    System.out.println("Invalid Color.");
                }

        }
    }
}
