package br.com.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalOperacoesIntermediarias {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9, 3, 11, 3, 4);

		System.out.println();

		// Opercações Intermediárias posso fazer varias operações antes de fazer
		// operação final

		System.out.println("\n *** SKIP ***");
		// Utilizado quando desejo pular elementos
		List<Integer> listaSkip = lista.stream().skip(2).collect(Collectors.toList());
		System.out.println(listaSkip);

		System.out.println("\n *** LIMIT ***");
		// Quantos elementos quero processar
		List<Integer> listaLimit = lista.stream().limit(2).collect(Collectors.toList());
		System.out.println(listaLimit);

		System.out.println("\n *** DISTINCT ***");
		// Não permite repetir valores
		List<Integer> listaDistinct = lista.stream().distinct().collect(Collectors.toList());
		System.out.println(listaDistinct);

		System.out.println("\n *** MAP ***");
		// faz tranformação de dados
		List<Integer> listaMap = lista.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(listaMap);

	}

}
