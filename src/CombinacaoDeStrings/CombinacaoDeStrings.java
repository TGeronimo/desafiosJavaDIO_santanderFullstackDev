package CombinacaoDeStrings;

import java.util.Scanner;

public class CombinacaoDeStrings {

    private static String string1;
    private static String string2;

    public static void main(String[] args) {
        CombinacaoDeStrings combinacaoDeStrings = new CombinacaoDeStrings();
        Scanner leitor = new Scanner(System.in);
//        int N = leitor.nextInt();
//        String restoString;

        string1 = leitor.next();
        string2 = leitor.next();


        if (string1.length() > string2.length()) {
            String maior = string1;
            String menor = string2;
            combinacaoDeStrings.combinaString(maior, menor);

        } else {
            String maior = string2;
            String menor = string1;
            combinacaoDeStrings.combinaString(maior, menor);
        }
    }

    public String combinaString(String maior, String menor) {
//        int resto = maior.length() - menor.length();
        String restoString = maior.substring(menor.length());
        System.out.println(maior + menor + restoString);
        return restoString;
    }
}

// AVALIAR ESTA SOLUÇÃO

//import java.util.Scanner;
//        import java.util.*;
//        import java.lang.*;
//public class Desafio {
//
//    public static void main(String[] args) {
//
//        Scanner leitor = new Scanner(System.in);
//
//        int N = Integer.parseInt(leitor.nextLine());//Recebe o primeiro valor do scanner, que é o numero de cadeias
//        int it = 0;//Será utilizado para contar iterações na hora de juntar as strings
//        // String resultado = "";//Irá guardar o nosso resultado
//
//        for (int i = 0; i < N; i++) {
//
//            String line = leitor.nextLine();//Recebe a cadeia de strings do scanner
//            String splitline[] = line.split(" ");//Quebra a cadeia de valores em duas partes, separadas por um espaço
//
//            int firstlength = splitline[0].length();//Recebe o tamanho da primeira parte
//            int secondlength = splitline[1].length();//Recebe o tamanho da segunda parte
//            int maxlength =  Math.max(firstlength,secondlength);//Verifica qual das strings possui o maior tamanho
//
//            StringBuilder construtor = new StringBuilder();//Para facilitar o processo, iremos criar um StringBuilder
//
//            for (int j = 0; j<maxlength; j++){//Este segundo for permite que façamos o append respeitando o tamanho dos Arrays
//                if(j<firstlength){
//                    construtor.append(splitline[0].charAt(j));
//                }
//                if(j<secondlength){
//                    construtor.append(splitline[1].charAt(j));
//                }
//            }
//
//            String resultado = construtor.toString();//Converte o StringBuilder para String;
//            System.out.println(resultado);//Imprime nossa saida
//        }
//    }
//}