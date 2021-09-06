package CorridaTartarugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CorridaDeTartarugas {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfTurtles;
        int speedLevel = 1;
        List<Integer> speeds = new ArrayList<>();

        do {
            speeds.clear();
            numberOfTurtles = Integer.parseInt(br.readLine()); // recebe o tamanho do grupo de tartarugas
            String str = br.readLine(); // aqui entram as velocidades das tartaruagas do grupo
            String s[] = str.split(" "); // separa as velocidades e as armazena no array s[]

            for (int i = 0; i < numberOfTurtles; i++) {
                speeds.add(Integer.valueOf(s[i]));
            }

            int maxSpeed = speeds
                    .stream()
                    .max(Integer::compare)
                    .get();

            if (maxSpeed > 0 && maxSpeed < 10) {
                speedLevel = 1;
            } else if (maxSpeed >= 10 && maxSpeed < 20) {
                speedLevel = 2;
            } else if (maxSpeed >= 20) speedLevel = 3;

            System.out.println(speedLevel);
        } while (br.ready());

    }
}

// CÓDIGO INICIAL DA DIO
//import java.io.*;
//
//public class Desafio {
//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //continue a solucao de acordo com o solicitado
//
//        int n;
//        do {
//            n = Integer.parseInt(br.readLine());
//            String str = br.readLine();
//            String s[] = str.split(" ");
//
//
//
//
//        }
//        System.out.println(m);
//    } while (br.ready());
//}
//}