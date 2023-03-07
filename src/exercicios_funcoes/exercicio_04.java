package exercicios_funcoes;

public class exercicio_04 {
    public static void main(String[] args) {
        // Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A função deve retornar um valor booleano.
        double valor = -5;
        System.out.println(verificaPositivoOuNegativo(valor));
    }
    public static boolean verificaPositivoOuNegativo(double valor){
        return !(valor < 0);
    }
}
