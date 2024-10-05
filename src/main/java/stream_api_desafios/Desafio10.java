package stream_api_desafios;


import java.util.Arrays;
import java.util.List;

//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public class Desafio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 30, 15, 25, 27, 21, 18);

        List<Integer> nums = numeros.stream()
                .distinct()
                .filter(n -> (n % 2 != 0) && (n % 3 == 0 || n % 5 == 0))
                .sorted()
                .toList();

        System.out.println(nums);
    }
}
