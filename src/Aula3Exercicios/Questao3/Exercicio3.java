package Aula3Exercicios.Questao3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio3 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;

        for(int i = 0 ; i < 3; i++){
            System.out.println("Insira o valor:");
            int valor = sc.nextInt();

            if (valor < menor){
                menor = valor;
            }
        }

        System.out.printf("O produto a ser comprado deve ser o que vale: R$ %d", menor);
    }
}
