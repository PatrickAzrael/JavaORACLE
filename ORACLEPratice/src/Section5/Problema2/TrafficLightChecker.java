package Section5.Problema2;

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a cor atual do semáforo: ");
        int currentcolor = leia.nextInt();

        if (currentcolor == 1){
            System.out.println("Next Traffic Light is green");
        }else if (currentcolor == 2){
            System.out.println("Next Traffic Light is yellow.");
        }else if (currentcolor == 3){
            System.out.println("Next Traffic Light is red.");
        } else {
            System.out.println("Invalid Color.");
        }

        leia.close();

    }
}
