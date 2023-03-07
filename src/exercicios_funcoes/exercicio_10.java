package exercicios_funcoes;

public class exercicio_10 {

    public static void main(String[] args) {
        double x = 45.0;
        double resultado = coseno(x);
        System.out.println(resultado);
    }

    public static double coseno(double valor){
        // Converter x para radianos
        valor = Math.toRadians(valor);
        // Inicializar as variáveis
        double resultado = 1.0;
        double sinal = -1.0;
        double fatorial = 1.0;
        // Calcular os 20 termos da série
        for (int i = 2; i <= 40; i += 2) {
            fatorial *= i * (i - 1);
            resultado += sinal * Math.pow(valor, i) / fatorial;
            sinal *= -1;
        }
        return resultado;

    }

}
