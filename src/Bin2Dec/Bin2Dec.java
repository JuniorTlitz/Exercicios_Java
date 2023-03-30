package Bin2Dec;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número binário: ");

        String binario = input.nextLine();
        int decimal = 0;
        int potencia = 0;

        for(int i = binario.length() - 1; i >= 0; i--){
            if(binario.charAt(i) == '1'){
                decimal += Math.pow(2, potencia);
            }
            potencia++;
        }

        System.out.println("O número decimal correspondente é: " + decimal);
    }
}
