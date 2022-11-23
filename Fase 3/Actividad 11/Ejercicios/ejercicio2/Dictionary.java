import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
	private ArrayList<OrderedPair> list;

	public Dictionary(int n) {
		this.list = new ArrayList<OrderedPair>(n);
	}

	public Dictionary() {
		this.list = new ArrayList<OrderedPair>();
	}

	public ArrayList<OrderedPair> getList() {
		return list;
	}

	public void setList(ArrayList<OrderedPair> list) {
		this.list = list;
	}

	public <K, V> void add(K key, V value) {
		OrderedPair parAgregar = new OrderedPair(key, value);
		list.add(parAgregar);
	}

	public <K> boolean delete(K key) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey().equals(key)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public <K, V> V getValue(K key) throws ObjectNoExist {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey().equals(key)) {
				V value = (V) list.get(i).getValue();
				return value;
			}
		}
		throw new ObjectNoExist();
	}

	@Override
	public String toString() {
		return "Dictionary \n" + list;
	}
}
