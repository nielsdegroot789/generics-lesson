import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Maak een klasse Person aan, met properties name (String) en age (int)
//		Zie ook dat die klasse FINAL is.

		Person patrick = new Person("Patrick", 55);
		Person patricia = new Person("Patricia", 50);
		Person gerrie = new Person("Gerrie", 20);

//		Person[] family = new Person[3];
//		family[0] = patrick;
//		family[1] = patricia;
//		family[2] = gerrie;

		Person[] family = { patrick, patricia, gerrie };

//		System.out.println(Arrays.toString(family));
		Person barrie = new Person("Barrie", 2);

//	Dit is fout:	family[3] = barrie; 

		family = add(barrie, family);

//		System.out.println(Arrays.toString(family));

//		LIST

		List<Person> familyList = new ArrayList<>(Arrays.asList(gerrie, patrick, patricia));

		for (int i = 0; i < familyList.size(); i++) {
			System.out.println(familyList.get(i).getName());
		}

//		Iterator

		final Iterator<Person> iterator = familyList.iterator();

//		System.out.println(iterator.hasNext());
//		System.out.println(iterator.next().getName());

//		while loop
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}

		for (Person person : familyList) {
			System.out.println(person.getAge());
		}

		System.out.println(familyList.get(0));

//		Set 

		List<Person> familyList2 = new ArrayList<>(Arrays.asList(patrick, patricia, patrick));

		Set<Person> familySet = new HashSet<>();

		familySet.add(patrick);
		familySet.add(patricia);
		familySet.add(patrick);

		System.out.println(familySet.contains(gerrie));

//		Map 

		Map<String, Person> familyMap = new HashMap<>();
		familyMap.put(barrie.getName(), barrie);
		familyMap.put(gerrie.getName(), gerrie);
		familyMap.put(patricia.getName(), patricia);

		System.out.println(familyMap.get("Gerrie"));
		System.out.println(familyMap.get("Gerrie"));

//		1. keyset
		for (String name : familyMap.keySet()) {
//			System.out.println(familyMap.get(name));
		}

//		2. values
		for (Person person : familyMap.values()) {
//			System.out.println(person);
		}

//		3. entryset
		for (Map.Entry<String, Person> entry : familyMap.entrySet()) {
			System.out.println(entry);
		}

		List<String> stuff = new LinkedList<>();

//		Comparator

		Collections.sort(familyList,
				(Person person1, Person person2) -> Integer.compare(person1.getAge(), person2.getAge()));

		System.out.println(familyList);

		Collections.sort(familyList, new ReverseComparator<>(new AgeComparator()));
		System.out.println(familyList);

//		OEFENING
//		Implementeer een klasse Table<K,V> dat een arrayList van Entry<K, V> elementen heeft.
//		geef methodes om de waarde geassocieerd met een key terug te geven,
//		om een value voor een bepaalde key te zetten, en om een key te verwijderen.

	}

	private static Person[] add(Person person, Person[] array) {
//		nieuwe array maken van family en nieuwe person erinsteken.
//		Person[] extendedFamily = new Person[array.length + 1];
//
//		for (int i = 0; i < array.length; i++) {
//			extendedFamily[i] = array[i];
//		}
//		
//		extendedFamily[array.length] = person;

//		of

		Person[] extendedFamily = Arrays.copyOf(array, array.length + 1);
		extendedFamily[array.length] = person;
		return extendedFamily;

	}
}
