package exercicios_funcoes;

public class exercicio_09 {
    // Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve retornar um valor booleano

    public static void main(String[] args) {
        int valor = 10;
        System.out.println(isPar(valor));
    }

    public static boolean isPar(int valor){
        return (valor % 2 == 0);
    }

}
