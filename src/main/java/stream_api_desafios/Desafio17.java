package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPrimo = numero -> {
            if (numero < 2) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                    .noneMatch(n -> numero % n == 0);
        };

        List<Integer> numsPrimos = numeros.stream()
                .distinct()
                .filter(isPrimo)
                .toList();

        System.out.println("Os números primos são: " + numsPrimos);
    }
}
