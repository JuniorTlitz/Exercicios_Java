package exercicios_funcoes;

public class exercicio_12 {
    //  Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S.
    //S = 1 + 1/1! + 1/2! + 1/3! + 1 /N!
    public static void main(String[] args) {
        int valor = 5;
        System.out.println(calculaSerie(valor));
    }

    public static double calculaSerie(double valor){

        double s = 1;
        double fatorial = 1;

        for(int i = 1; i <= valor; i++){

            fatorial *= i;
            s += 1 / fatorial; // S = 1 + 1/1! + 1/2! + 1/3! + 1 /N!

        }

        return s;

    }

}
