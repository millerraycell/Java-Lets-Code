package Exercicio02.Questao3;

import java.util.Scanner;

public class Execicio3 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius:");
        Integer temp = sc.nextInt();
        Double valorConvertido;

        valorConvertido = ((9*temp)+160)/5.0;

        System.out.printf("Temperatura em Farenheit: %.2f", valorConvertido);
    }
}
