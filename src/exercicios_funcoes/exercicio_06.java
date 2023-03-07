package exercicios_funcoes;

public class exercicio_06 {
    public static void main(String[] args) {
        // Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna o valor lógico Verdadeiro caso o valor seja primo e Falso em caso contrário.
        int valor = 15;
        boolean isPrime = isPrime(valor);
        System.out.println("O número " + valor + " é primo? " + isPrime);
        // imprime "O número 17 é primo? true"
    }

    public static boolean isPrime(int valor){
        if(valor <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(valor); i++){
            if(valor % i == 0){
                return false;
            }
        }

        return true;
    }
}
