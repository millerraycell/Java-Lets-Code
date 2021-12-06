package Exercicio02.Questao4;

import java.util.Scanner;

public class Exercicio4 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a cotação do dolar hoje:");
        double cotacao = sc.nextDouble();

        System.out.println("Insira o valor que deseja fazer a conversão:");
        double valor = sc.nextDouble();

        System.out.printf("Valor em dólar: US$ %.2f", (valor/cotacao));
    }
}
