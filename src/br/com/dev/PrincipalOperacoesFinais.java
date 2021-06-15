package br.com.dev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class PrincipalOperacoesFinais {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 6, 9, 9, 3, 11, 3, 4);

		System.out.println();

		List<Person> people = Arrays.asList(new Person("Goku", 55), new Person("Ikki", 33), new Person("Naruto", 27),
				new Person("Pan", 5), new Person("Seya", 29), new Person("Vegeta", 61), new Person("Bills", 130),
				new Person("Hyoga", 30), new Person("Itachi", 40), new Person("Jiraiya", 55));

		// Operaçoes finais quando acionada, meu stream esta fechado, não consigo fazer mais nada.

		System.out.println("\n *** Filter *** ");
		List<Person> menoresDe30anos = people.stream().filter(i -> i.getAge() <= 30).collect(Collectors.toList());
		System.out.println(menoresDe30anos);

		System.out.println(" *** SORT *** ");
		List<Person> ordenarPorIdade = people.stream().sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		System.out.println(ordenarPorIdade);

		System.out.println("\n*** COUNT ***");
		// retorna a quantidade de itens do array
		Long count = lista.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Qtde de itens pares.: " + count);

		System.out.println("\n*** MIN ***");
		// retorna o menor valor do array
		Optional<Integer> min = lista.stream().min(Comparator.naturalOrder());
		System.out.println("Menor valor.: " + min.get());

		System.out.println("\n *** MIN 2 ***");
		// Encontre o minimo valor em uma lista
		OptionalInt menorIdade = people.stream().mapToInt(i -> i.getAge()).min();
		System.out.println("Menor Idade.: " + menorIdade);

		System.out.println("\n*** MAX ***");
		// retorna o maior valor do array
		Optional<Integer> max = lista.stream().filter(i -> i % 2 == 0).max(Comparator.naturalOrder());
		System.out.println("Maior valor par.: " + max.get());

		System.out.println("\n *** MAX 2 ***");
		// Encontre o máximo valor em uma lista
		OptionalInt maiorIdade = people.stream().mapToInt(i -> i.getAge()).max();
		System.out.println("Maior idade.: " + maiorIdade.getAsInt());

		System.out.println("\n *** ALL MATCH *** ");
		// Retorna true se todos os elementos desse fluxo correspondem ao predicado
		// fornecido.
		boolean isAllMatch = people.stream().allMatch(i -> i.getAge() <= 30);
		System.out.println("Todos são menores que 30.: " + isAllMatch);

		System.out.println("\n *** ANY MATCH *** ");
		// Retorna true se pelo menos um elemento desse fluxo corresponder ao predicado
		// fornecido.
		boolean isAnyMarch = people.stream().anyMatch(i -> i.getAge() < 30);
		System.out.println("Pelo menos um e menor que 30.: " + isAnyMarch);

		System.out.println("\n *** NONE MATCH ***");
		// Retorna true se nem um dos elemento do fluxo corresponder ao predicado
		// fornecido.
		boolean isNoneMatch = people.stream().noneMatch(i -> i.getAge() < 4);
		System.out.println("Todos tem idade menor que 4.: " + isNoneMatch);
		
	}

}
