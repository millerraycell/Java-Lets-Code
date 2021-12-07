package Aula3Exercicios.Questao1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o turno que você estuda:\nM - Matutino, V - Vespertino, N - Noturno");
        String response = sc.next();

        if (response.equals("M")){
            System.out.println("Bom dia!");
        }
        else if (response.equals("V")){
            System.out.println("Boa tarde!");
        }
        else if (response.equals("N")){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Valor Inválido");
        }

    }
}
