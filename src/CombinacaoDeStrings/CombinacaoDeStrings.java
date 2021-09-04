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