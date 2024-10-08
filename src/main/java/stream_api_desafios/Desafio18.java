package stream_api_desafios;

import java.util.Arrays;
import java.util.List;

//Desafio 18 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 3);

        boolean numsIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("Todos os números da lista são iguais? " + numsIguais);
    }
}
