public class OrderedPair<K,V> implements Pair<K,V>{
	//Atributos
	private K key;
	private V value;
	
	//Constructor
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//Metodos desarrollados 
	public K getKey() {
		return this.key;
	}
	 
	public V getValue() {
		return this.value;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OrderedPair) {
			OrderedPair orderedPairComparar = (OrderedPair) obj;
			return  this.key.equals(orderedPairComparar.key)
					&& this.value.equals(orderedPairComparar.value);
		}
		return false;
	}
	
	

	//To String
	@Override
	public String toString() {
		return "\tKey: " + this.key + 
				"\tValue: " + this.value+"\n";
	}
	@Override
	public int compareTo(OrderedPair o) {
		return ((Comparable) this.key).compareTo(o.getKey());
	}

	
}
