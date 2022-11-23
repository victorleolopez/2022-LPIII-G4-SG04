public class App {
	public static void main(String[] args) throws ObjectNoExist {
		try {
			Dictionary dict1 = new Dictionary();
			dict1.add("A100", "Johan Mamani");
			dict1.add("A200", "Victor Lopez");
			dict1.add(300, "Carlos Jarata");
			dict1.add(400, "Percy Carlos Diaz Tupayachi");
			System.out.println("ADD");
			System.out.println(dict1);
			System.out.println(" ");

			System.out.println("DELETE");
			System.out.println(dict1.delete("A200"));
			System.out.println(dict1);
			System.out.println("\n");

			System.out.println("GETVALUE");
			System.out.println(dict1.getValue("A100").toString());
			System.out.println(dict1.getValue(300).toString());
		} catch (ObjectNoExist e) {
			System.out.println(e.getMessage());
		}
	}
}
