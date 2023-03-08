package exercicios_funcoes;

public class exercicio_11 {

    public static void main(String[] args) {

        int valorX = 2;
        int valorY = 2;

        System.out.println(potencia(valorX, valorY));

    }

    public static int potencia(int valorX, int valorY){

        int resultado = 1;

        for(int i = 1; i <= valorY; i++){
            resultado *= valorX;
        }

        return resultado;

    }

}
