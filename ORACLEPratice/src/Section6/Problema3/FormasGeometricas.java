package Section6.Problema3;

public class FormasGeometricas {
    public static void main(String args[]) {

        int altura = 5;
        int largura = 4;

        Rectangle(largura, altura);

        System.out.println(" ");

        int comprimento = 5;
        createTriangle(comprimento);
    }

    public static void Rectangle(int altura, int largura) {
        if ((largura < 1) || (altura < 1)) {
            System.out.println("Para formar um retângulo, as dimensões devem ser maiores que 1.");
        }
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                if (linha == 0 || linha == altura - 1 || coluna == 0 || coluna == largura - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void createTriangle(int comprimento) {
        if (comprimento < 1) {
            System.out.println("A dimensão da perna do triângulo deve ser maior que 1.");
            return;
        }
        for (int linha = 0; linha < comprimento; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                if (linha == comprimento - 1 || coluna == 0 || coluna == linha) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}