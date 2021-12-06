package Exercicio02.Questao2;

import java.util.Scanner;

public class Exercicio2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();
        int i = 1;

        while (i <= 10){
            System.out.printf("%d * %d = %d\n",i, number, (number*i));
            i++;
        }

    }
}
