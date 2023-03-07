package exercicios_funcoes;

public class exercicio_01 {
    public static void main(String[] args) {
        // Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3.P .R3).
        System.out.println("O volume da esfera é de: " + calcVolumeEsfera(5));
    }

    public static double calcVolumeEsfera(double raio){
        double expoente = Math.pow(raio, 3);
        int div = 4 / 3;
        double PI = 3.14;
        return div * PI * expoente;
    }

}
