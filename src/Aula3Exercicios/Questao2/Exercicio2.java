package Aula3Exercicios.Questao2;

import java.util.Scanner;

public class Exercicio2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Insira a quantidade de produtos:");

        int quant = sc.nextInt();

        for(int i = 0; i < quant; i++){
            System.out.println("Insira o valor do produto:");
            int entrada = sc.nextInt();

            soma += entrada;
        }

        System.out.printf("Valor total da conta: R$ %d",soma);
    }
}
