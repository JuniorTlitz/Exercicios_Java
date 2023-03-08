package estrutura_condicional;

public class exercicio_01 {
    // Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles.
    public static void main(String[] args) {
        int valor = 10;
        int valorY = 8;
        System.out.println(maiorOuMenor(valor, valorY));
    }

    public static int maiorOuMenor(int valorX, int valorY){
        // Da pra simplificar a verificação com a função, mas a ideia do exercicio é treinar estrutura condicional
        // return Math.max(valorX, valorY);
        if(valorX > valorY){
            return valorX;
        } else {
            return valorY;
        }
    }

}
