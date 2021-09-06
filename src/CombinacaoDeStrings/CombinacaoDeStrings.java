package CombinacaoDeStrings;

import java.util.Scanner;

public class CombinacaoDeStrings {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = Integer.parseInt(leitor.nextLine()); // recebe o número de casos de teste

        for (int i = 0; i < N; i++) { // recebe as strings, de acordo com o número de casos de teste informados

            String stringsInseridas = leitor.nextLine(); // Recebe as duas strings inseridas na mesma linha
            String stringsSeparadas[] = stringsInseridas.split(" "); // o método split() separa uma string de acordo com o que foi passado como parâmetro, armazenando cada string resultante em uma posição do array

            // usa o método Math.max() para verificar qual das strings tem a maior quantidade de caracteres
            int primeiraString = stringsSeparadas[0].length();
            int segundaString = stringsSeparadas[1].length();
            int maiorString =  Math.max(primeiraString, segundaString);

            StringBuilder combinaStrings = new StringBuilder(); // StringBuilder utilizado para criar a string final

            for (int j = 0; j < maiorString; j++) { // combina cada caracter de cada string em uma string final
                // estes ifs garantem que não ocorra um OutOfBoundsException devido a diferença de tamanho entre as strings, na busca com o charAt()
                if (j < primeiraString) {
                    combinaStrings.append(stringsSeparadas[0].charAt(j));
                }
                if (j < segundaString) {
                    combinaStrings.append(stringsSeparadas[1].charAt(j));
                }
            }

            // exibe o resultado no console
            System.out.println(combinaStrings);
        }
    }
}