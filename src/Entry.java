import java.util.Objects;

public class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {

		Objects.requireNonNull(key, "Key is null");
		Objects.requireNonNull(value, "value is null");

		this.key = key;
		this.value = value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	@Override
	public String toString() {
		return "Key: " + key + ",  Value:" + value;
	}

}