package EncaixaOuNao;

import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

//continue a solucao

        for (int i = 0; i < N; i++) {
            String firstNumber = leitor.next();
            String secondNumber = leitor.next();
            if (firstNumber.endsWith(secondNumber))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}