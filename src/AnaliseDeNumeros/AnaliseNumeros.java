package AnaliseDeNumeros;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {

    static int par = 0;
    static int impar = 0;
    static int positivo = 0;
    static int negativo = 0;

    public static void main(String[] args) throws IOException {

        AnaliseNumeros analiseNumeros = new AnaliseNumeros();
        analiseNumeros.verificaEntrada();


        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }

    public void verificaEntrada() {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int temp = leitor.nextInt();
            parOuImpar(temp);
            positivoOuNegativo(temp);
        }
    }

    public void positivoOuNegativo(int entrada) {
        if (entrada > 0) {
            positivo++;
        } else if (entrada < 0) negativo++;
    }

    public void parOuImpar(int entrada) {
        if (entrada % 2 == 0) {
            par++;
        } else impar++;
    }

}
