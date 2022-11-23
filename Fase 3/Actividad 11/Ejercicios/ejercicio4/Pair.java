public interface Pair <K, V> {
	K getKey();
	V getValue();
	int compareTo(OrderedPair o);
}

