package exercicios_funcoes;

public class exercicio_07 {
    public static void main(String[] args) {
        // Faça um procedimento que recebe por parâmetro os valores necessário para o cálculo da fórmula de báskara e retorna, também por parâmetro, as suas raízes, caso seja possível calcular.
        double a = 1;
        double b = -3;
        double c = 2;

        double[] raizes = calculaBhaskara(a, b, c);

        System.out.println("Raízes da equação: " + raizes[0] + " e " + raizes[1]);
    }
    public static double[] calculaBhaskara(double a, double b, double c) {
        double[] raizes = new double[2];
        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0) {
            System.out.println("Não há raízes reais para a equação.");
        } else {
            raizes[0] = (-b + Math.sqrt(delta)) / (2*a);
            raizes[1] = (-b - Math.sqrt(delta)) / (2*a);
        }

        return raizes;
    }


}
