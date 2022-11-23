public class OrderedPair<K,V> implements Pair<K,V> {
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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OrderedPair) {
			OrderedPair orderedPairComparar = (OrderedPair) obj;
			return  this.key.equals(orderedPairComparar.key)
					&& this.value.equals(orderedPairComparar.value);
		}
		return false;
	}

	@Override
	public String toString() {
		return "\tKey: " + this.key + 
				"\tValue: " + this.value+"\n";
	}
	
}
