package br.com.cedeamigo;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Goku", 55), new Person("Ikki", 33), new Person("Naruto", 29),
				new Person("Pan", 5), new Person("Seya", 29), new Person("Vegeta", 61), new Person("Bills", 130),
				new Person("Hyoga", 30), new Person("Itachi", 40), new Person("Jiraiya", 55));

		System.out.println();

		System.out.println(" *** Filter *** ");

		System.out.println();

		System.out.println(" *** SORT *** ");

		System.out.println();

		System.out.println(" *** ALL MATCH *** ");

		System.out.println();

		System.out.println(" *** ANY MATCH *** ");

		System.out.println();

		System.out.println(" *** NONE MATCH ***");

		System.out.println();

		System.out.println(" *** MAX ***");

		System.out.println();

		System.out.println(" *** MIN ***");

		System.out.println();

	}
}
