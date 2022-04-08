package chap13.book.Exercise.p03;

public class Container<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
