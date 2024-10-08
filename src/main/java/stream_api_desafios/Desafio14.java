package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPrimo = numero -> {
            if (numero < 2) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                    .noneMatch(n -> numero % n == 0);
        };

        Optional<Integer> maiorPrimo = numeros.stream()
                .distinct()
                .filter(isPrimo)
                .sorted((a, b) -> b - a) //ordena em ordem decrescente
                .findFirst();

        System.out.println("O maior número primo nessa lista é: " + maiorPrimo);
    }
}
