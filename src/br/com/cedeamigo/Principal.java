package br.com.cedeamigo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Goku", 55), new Person("Ikki", 33), new Person("Naruto", 27),
				new Person("Pan", 5), new Person("Seya", 29), new Person("Vegeta", 61), new Person("Bills", 130),
				new Person("Hyoga", 30), new Person("Itachi", 40), new Person("Jiraiya", 55));

		System.out.println();

		System.out.println(" *** Filter *** ");
		List<Person> menoresDe30anos = people.stream().filter(i -> i.getAge() <= 30).collect(Collectors.toList());
		System.out.println(menoresDe30anos);

		System.out.println(" *** SORT *** ");
		List<Person> ordenarPorIdade = people.stream().sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		System.out.println(ordenarPorIdade);

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

		System.out.println("\n *** MAX ***");
		// Encontre o máximo valor  em uma lista
		OptionalInt maiorIdade = people.stream().mapToInt(i -> i.getAge()).max();
		System.out.println("Maior idade.: "+ maiorIdade);

		System.out.println("\n *** MIN ***");
		// Encontre o minimo valor  em uma lista
		OptionalInt menorIdade = people.stream().mapToInt(i -> i.getAge()).min();
		System.out.println("Menor Idade.: "+ menorIdade);

		
	}
}
