public class App {

	public static void main(String[] args) {
		Dictionary dict1 = new Dictionary();
		dict1.addUniq("1", "Juan");
		dict1.addUniq("2", "www.youtube.com");
		dict1.addUniq("3", "Percy Carlos Diaz Tupayachi");
		dict1.addUniq("1", "Felipe");

		System.out.println("ADD");
		System.out.println(dict1);

		System.out.println("ERROR");
		dict1.addUniq("YouTube", "www.youtube.com");
		System.out.println(dict1);

		System.out.println(" ");

		System.out.println("SORT");
		dict1.sort();
		System.out.println(dict1);

		System.out.println("getAllValues");
		imprimirArray(dict1.getAllValues("1"));

	}

	public static <T> void imprimirArray(T[] inputArray) {
		for (T elemento : inputArray)
			System.out.printf("%s  ", elemento);
		System.out.println();
	}
}
