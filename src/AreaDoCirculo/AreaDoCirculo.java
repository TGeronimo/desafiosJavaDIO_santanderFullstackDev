package AreaDoCirculo;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        double raio;
        double area;

        raio = scan.nextDouble();// leitura do raio através da entrada do usuário
        area = pi * (Math.pow(raio, 2)); // cálculo da área; Math.pow eleva o primeiro parâmetro à potência definida pelo segundo parâmetro

        System.out.printf("A=%.4f\n", area); // informa o valor calculado da área
    }
}
