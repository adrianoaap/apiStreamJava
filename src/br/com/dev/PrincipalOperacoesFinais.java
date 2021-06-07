package br.com.dev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrincipalOperacoesFinais {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 6, 9, 9, 3, 11, 3, 4);

		// Operaçoes finais quando acionada, meu stream esta fechado, não consigo fazer
		// mais nada.

		System.out.println("\n*** COUNT ***");
		// retorna a quantidade de itens do array
		Long count = lista.stream().filter(i -> i% 2 ==0).count();
		System.out.println("Qtde de itens pares.: " + count);

		System.out.println("\n*** MIN ***");
		// retorna o menor valor do array
		Optional<Integer> min = lista.stream().min(Comparator.naturalOrder());
		System.out.println("Menor valor.: " + min.get());

		System.out.println("\n*** MAX ***");
		// retorna o maior valor do array
		Optional<Integer> max = lista.stream().filter(i -> i % 2 == 0).max(Comparator.naturalOrder());
		System.out.println("Maior valor par.: " + max.get());
		
		
		System.out.println("\n*** COLLECT TO LIST***");

		System.out.println("\n*** COLLECT GROUP BY***");

	}

}
