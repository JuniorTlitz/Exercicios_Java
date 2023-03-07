package exercicios_funcoes;

public class exercicio_08 {

    //Faça um procedimento que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, a categoria desse nadador de acordo com a tabela abaixo:

    public static void main(String[] args) {
        int idade = 79;
        System.out.println(tabelaNatacao(idade));
    }

    public static String tabelaNatacao(int idade) {
        if (idade < 5) {
            return "Não tem categoria";
        } else if (idade <= 7) {
            return "Infantil A";
        } else if (idade <= 10) {
            return "Infantil B";
        } else if (idade <= 13) {
            return "Juvenil A";
        } else if (idade <= 17) {
            return "Juvenil B";
        } else {
            return "Adulto";
        }
    }

}
