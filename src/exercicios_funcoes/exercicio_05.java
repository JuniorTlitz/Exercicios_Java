package exercicios_funcoes;

public class exercicio_05 {
    public static void main(String[] args) {
        // Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a letra for A o procedimento calcula a média aritmética das notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H, a sua média harmônica. A média calculada também deve retornar por parâmetro.
        double nota1 = 5;
        double nota2 = 8;
        double nota3 = 8;
        char letra = 'H';

        System.out.println(calcularMedia(nota1, nota2, nota3, letra));
    }
    public static double calcularMedia(double nota1, double nota2, double nota3, char letra){

        double resultado = 0;

        if(letra == 'A'){
            resultado = (nota1 + nota2 + nota3) / 3;
        } else if(letra == 'P'){
            resultado = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
        } else if(letra == 'H'){
            resultado = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
        }

        return resultado;

    }
}
