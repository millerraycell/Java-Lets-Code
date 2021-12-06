package Exercicio02.Questao1;

import java.util.Scanner;

public class Exercicio1 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first number:");
        Integer number1 = sc.nextInt();

        System.out.println("Insert second number:");
        Integer number2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n", number1, number2, (number1+number2));
        System.out.printf("%d - %d = %d\n", number1, number2, (number1-number2));
        System.out.printf("%d * %d = %d\n", number1, number2, (number1*number2));
        System.out.printf("%d / %d = %d\n", number1, number2, (number1/number2));
    }
}
