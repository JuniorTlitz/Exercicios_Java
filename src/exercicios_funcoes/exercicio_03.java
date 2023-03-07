package exercicios_funcoes;

public class exercicio_03 {
    public static void main(String[] args) {
    // Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.
        int anos = 24;
        int meses = 5;
        int dias = 79;

        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
        System.out.printf("A idade de %d anos, %d meses e %d dias é de %d dias", anos, meses, dias, idadeEmDias);
    }
    public static int calcularIdadeEmDias(int anos, int meses, int dias){
        return anos * 365 + meses * 12 + dias;
    }
}
