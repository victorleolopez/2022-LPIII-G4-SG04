public class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Par ordenado: (" + getKey() + "," + getValue() + ")";
	}
}