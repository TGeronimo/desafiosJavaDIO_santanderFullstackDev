package ContagemDeCedulas;

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas{

    // CÓDIGO DE EXEMPLO DA DIO, A SER MODIFICADO
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = ;
        atual -=  ;
        int notas20 = ;
        atual -=  ;
        int notas10 =   ;
        atual -=   ;
        int notas5 = ;
        atual -= ;
        int notas2 = ;
        atual -= ;
        int notas1 = atual;

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(   + " nota(s) de R$ 50,00");
    }

}
