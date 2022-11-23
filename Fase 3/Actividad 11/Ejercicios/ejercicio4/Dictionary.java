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

	public <K,V> void add(K key, V value) {
		OrderedPair parAgregar = new OrderedPair(key,value);
		list.add(parAgregar);
	}
	
	public <K,V> void addUniq(K key, V value) {
		OrderedPair parAgregar = new OrderedPair(key,value);
		int valor = getIndex(parAgregar);
		if(valor == -1) {
			list.add(parAgregar);
		}
		else {
			System.out.println("Ya existe ese par en el arreglo");
		}
	}
	
	public int getIndex(OrderedPair obj){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == null) {
				if(obj == null)
					return i;
		    }
			else if(list.get(i).equals(obj)){
				return i;
			}
		}
		return -1;
	}
	
	public void sort() {
		burbujaDescendente(list);
	}
	
	public static void burbujaDescendente(ArrayList<OrderedPair> list) {
		for (int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				OrderedPair elemActual = list.get(j), 
						elemSiguiente = list.get(j+1);
				if(elemActual.compareTo(elemSiguiente) < 0) {
					list.set(j,elemSiguiente);
					list.set(j+1,elemActual);
				}
			}
		}
	}
	
	public <T> OrderedPair [] getAllValues(T key) {
		ArrayList<OrderedPair> listLlaves = new ArrayList<OrderedPair>(list.size());
		int length = list.size();
		for (int i = 0; i < length ; i++) {
			if (list.get(i).getKey().equals(key)) {
				OrderedPair parAgregar = new OrderedPair(key,list.get(i).getValue());
				listLlaves.add(parAgregar);
		    }
		}
		OrderedPair array[] = new OrderedPair[listLlaves.size()];
		listLlaves.toArray(array);
		return array;
	}
	
	public <K> boolean delete(K key) {
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getKey().equals(key)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public <K,V> V getValue (K key) throws ObjectNoExist {
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getKey().equals(key)) {
				V value = (V)list.get(i).getValue();
				return value;
			}
		}
		throw new ObjectNoExist();
	}
	
	@Override
	public String toString() {
		return "Dictionary" + list ;
	}
}
