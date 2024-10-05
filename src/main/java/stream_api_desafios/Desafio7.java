package stream_api_desafios;

//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 13, 15);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // remove numeros repetidos
                .sorted((a, b) -> b - a) //ordena em ordem decrescente
                .skip(1) //pula o primeiro (maior numero)
                .findFirst(); //pega o segundo maior

        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}
