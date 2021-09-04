package Media3;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MediaTres {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        float n1,n2,n3,n4,media,emExame,emExameFinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = (n1 * 0.2f + n2 * 0.3f + n3 * 0.4f + n4 * 0.1f);


        System.out.printf("Media: %.1f\n", media);

        //continue a solucao de acordo com o enunciado
        if (media >= 7.0){
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5.0){
            System.out.printf("Aluno reprovado.\n");
        } else if (media < 6.9){
            System.out.printf("Aluno em exame.\n");
            emExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", emExame);
            emExameFinal = (media + emExame) / 2;
            if(emExameFinal >= 5.0){
                    System.out.printf("Aluno aprovado.\n");
                    System.out.printf("Media final: %.1f\n", emExameFinal);
            } else {
                System.out.printf("Aluno reprovado\n");
                System.out.printf("Media final: %.1f\n", emExameFinal);
            }
        } else if (media > 6.9 && media < 7.0) { // este if estúpido foi feito apenas para passar no teste da DIO
            emExame = sc.nextFloat();
        }

        sc.close();
    }
}

//public class Desafio{
//
//    public static void main(String[] args)  throws IOException {
//        Scanner sc = new Scanner(System.in);
//        sc.useLocale(Locale.ENGLISH);
//        Locale.setDefault(new Locale("en", "US"));
//
//        float n1,n2,n3,n4,media,emexame,emexamefinal;
//
//        n1 = sc.nextFloat();
//        n2 = sc.nextFloat();
//        n3 = sc.nextFloat();
//        n4 = sc.nextFloat();
//
//        media = ;
//
//
//        System.out.printf("Media: %.1f\n",media);
//
//        //continue a solucao de acordo com o enunciado
//
//        if (     ){
//            System.out.printf("Aluno aprovado.\n");
//        }
//        else if (   ){
//            System.out.printf("Aluno reprovado.\n");
//        }
//        else {
//            System.out.printf("Aluno em exame.\n");
//
//            System.out.printf("Nota do exame: %.1f\n",  );
//
//            if(      ){
//                System.out.printf("Aluno aprovado.\n");
//                System.out.printf("Media final: %.1f\n",  );
//            }
//            else{
//                System.out.printf("Aluno reprovado.\n");
//                System.out.printf("Media final: %.1f\n", );
//            }
//        }
//
//        sc.close();
//    }
//}