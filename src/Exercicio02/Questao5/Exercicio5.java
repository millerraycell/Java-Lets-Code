package Exercicio02.Questao5;

import java.util.Scanner;

public class Exercicio5 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor em polegadas:");
        int inches = sc.nextInt();

        System.out.printf("Valor em centímetros: %.2f\n", inches*2.54);
    }
}
