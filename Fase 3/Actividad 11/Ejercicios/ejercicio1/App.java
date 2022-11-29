public class App {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExistsList {
		try {

			CandyBags cb = new CandyBags(5, "Crusch");

			Goodies g1 = new Goodies(1, "Chupetin", (float) 1.8);
			// frunas choc1 = new frunas(2, "Sublime", (float) 1.5, "Amargo");
			Chocolates choc1 = new Chocolates(2, "Sublime", (float) 1.5, "Amargo");
			Biscuits bis1 = new Biscuits(3, (float) 2.3, "Princesa", "Estrella");
			Soda sal1 = new Soda(4, (float) 1.60, "Coca cola", 2.2);
			Sweet dul1 = new Sweet(5, (float) 1.70, "Corazon", 9.2);

			cb.add(g1);
			cb.add(choc1);
			cb.add(bis1);
			cb.add(sal1);
			cb.add(dul1);
			System.out.println(cb);
			System.out.println("\n***********cheapest***********");
			System.out.println(cb.cheapest());
			System.out.println("\n***********mostExpensive***********");
			System.out.println(cb.mostExpensive(2));

		} catch (IsFull | ExistsList exc) {
			System.out.println(exc.getMessage());
		}

	}

}
