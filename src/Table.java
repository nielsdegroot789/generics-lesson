import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
//  OEFENING.  maak een klasse Table<K,V> dat een arrayList van Entry<K, V> elementen heeft.
//	maak een methode put om nieuwe entries in de arraylist te steken.
//  geef methodes om de waarde geassocieerd met een key terug te geven,
// , en om een key te verwijderen.

	List<Entry<K, V>> entries = new ArrayList<>();

	public void put(K key, V value) {
		entries.add(new Entry<>(key, value));
	}

	public V getValue(K key) {
		V value = null;
		Entry<K, V> foundEntry = searchEntry(key);
		return foundEntry.getValue();
	}

	public void removeEntry(K key) {
		// loopen over entries
		Entry<K, V> foundEntry = searchEntry(key);
		entries.remove(foundEntry);
	}

//	methode om een value voor een bepaalde key te zetten
	public void updateValue(K key, V value) {

		Entry<K, V> foundEntry = searchEntry(key);
		foundEntry.setValue(value);

	}

	public Entry<K, V> searchEntry(K key) {
		Entry<K, V> foundEntry = null;
		for (Entry<K, V> entry : entries) {
			if (key == entry.getKey()) {
				foundEntry = entry;
			}
		}

		return foundEntry;
	}

	public List<Entry<K, V>> getEntries() {
		return this.entries;
	}

}
