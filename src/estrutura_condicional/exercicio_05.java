package estrutura_condicional;

public class exercicio_05 {

    /**
     * Faça um programa para a leitura de duas notas parciais de um aluno.*
     * A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
     * A mensagem “Aprovado com Distinção”, se a média for igual a dez;
     * A mensagem “Reprovado” se a média for menor de do que sete;
     */

    public static void main(String[] args) {

        double nota1 = 10;
        double nota2 = 10;

        double media = ( nota1 + nota2 ) / 2;

        if(media == 10){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }

}
