package exercicios_funcoes;

public class exercicio_01 {
    public static void main(String[] args) {
        // Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3.P .R3).
        double raio = 5;
        double volume = calcularVolumeEsfera(raio);
        System.out.printf("O raio é %.2f e o volume é %.2f", raio, volume);
    }

    public static double calcularVolumeEsfera(double raio) {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

}
