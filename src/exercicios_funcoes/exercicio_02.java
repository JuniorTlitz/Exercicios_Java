package exercicios_funcoes;

public class exercicio_02 {
    public static void main(String[] args) {
        //Faça uma função que recebe por parâmetro o tempo de duração de uma fábrica expressa em segundos e retorna também por parâmetro esse tempo em horas, minutos e segundos.
        int duracaoEmSegundos = 5900;
        int[] tempo = new int[3];
        calcularTempo(duracaoEmSegundos, tempo);
        System.out.printf("%d horas, %d minutos e %d segundos", tempo[0], tempo[1], tempo[2]); // imprime (exemplo) "1 horas, 0 minutos e 0 segundos"
    }

    public static void calcularTempo(int duracaoEmSegundos, int[] tempo) {
        int horas = duracaoEmSegundos / 3600;
        int minutos = (duracaoEmSegundos % 3600) / 60;
        int segundos = duracaoEmSegundos % 60;

        tempo[0] = horas;     // índice 0 representa as horas
        tempo[1] = minutos;   // índice 1 representa os minutos
        tempo[2] = segundos;  // índice 2 representa os segundos
    }

}
