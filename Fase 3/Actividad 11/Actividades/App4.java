import java.util.Arrays;

public class App4 {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist {

		try {

			Bagg<Goodies> bagGoodies = new Bagg<Goodies>(2);

			Goodies g1 = new Goodies(1, "Galletas", 1.5f);
			Goodies g2 = new Goodies(2, "Chocolate", 2.5f);
			Goodies g3 = new Goodies(3, "Papitas", 1.5f);

			bagGoodies.add(g1);
			bagGoodies.add(g2);
			System.out.println(bagGoodies);

			System.out.print("El Galletas se encuentra en la Posicion : ");
			System.out.println(bagGoodies.getIndex(g1));
			System.out.print("El Papitas se encuentra en la Posicion : ");
			System.out.println(bagGoodies.getIndex(g3));

			System.out.println("Se elimino el numero : " + bagGoodies.remove(g2));
			System.out.println(bagGoodies);
			bagGoodies.add(g3);
			System.out.println(bagGoodies);

			System.out.println("Usando getObjects");
			System.out.println(Arrays.toString(bagGoodies.getObjects()));
			System.out.println(" ");
			System.out.println(" ");

			// Instanciaci�n de la clase generica para Chocolates
			Bagg<Chocolates> bagChocolates = new Bagg<Chocolates>(2);

			// Usando el metodo add
			Chocolates choc1 = new Chocolates(1, "Chocolate", 1.5f, "Amargo");
			Chocolates choc2 = new Chocolates(2, "Chocolate", 2.5f, "Dulce");
			Chocolates choc3 = new Chocolates(3, "Chocolate", 2.5f, "Cafe");

			bagChocolates.add(choc1);
			bagChocolates.add(choc2);
			System.out.println(bagChocolates);

			// Usando el metodo getIndex
			System.out.print("El Chocolate Amargo se encuentra en la Posicion : ");
			System.out.println(bagChocolates.getIndex(choc1));
			System.out.print("El Chocolate de Cafe se encuentra en la Posicion : ");
			System.out.println(bagChocolates.getIndex(choc3));

			// Usando el metodo getObjects
			System.out.println("Usando getObjects");
			System.out.println(Arrays.toString(bagChocolates.getObjects()));
			System.out.println(" ");
			System.out.println(" ");

			// Instanciaci�n de la clase generica para Biscuits
			Bagg<Biscuits> bagBiscuits = new Bagg<Biscuits>(2);

			// Usando el metodo add
			Biscuits bis1 = new Biscuits(1, "Galleta", 1.8f, "Dulce", "Estrella");
			Biscuits bis2 = new Biscuits(2, "Galleta", 1.5f, "Salada", "Cuadrado");
			bagBiscuits.add(bis1);
			bagBiscuits.add(bis2);
			System.out.println(bagBiscuits);

			// Usando el metodo getIndex
			System.out.print("Galleta Dulce en forma de Estrella se encuentra en la Posicion : ");
			System.out.println(bagChocolates.getIndex(choc1));
			System.out.print("Galleta Dulce en forma de Corazon se encuentra en la Posicion : ");
			System.out.println(bagChocolates.getIndex(choc3));
			System.out.println(" ");
			System.out.println(" ");

			// Instanciaci�n de la clase generica para Soda
			Bagg<Soda> bagSoda = new Bagg<Soda>(2);

			// Usando el metodo add
			Soda sal1 = new Soda(1, "Galleta", 1.8f, "Cuadrado", 2.2);
			Soda sal2 = new Soda(1, "Galleta", 1.8f, "Rectangulo", 3.1);
			Soda sal3 = new Soda(3, "Galleta", 1.7f, "Cudrado", 4.0);
			bagSoda.add(sal1);
			bagSoda.add(sal2);
			System.out.println(bagBiscuits);

			// Usando el metodo getIndex
			System.out.print("Galleta SALADA en forma de Cuadrado con 2.2 ml sal se encuentra en la Posicion : ");
			System.out.println(bagSoda.getIndex(sal1));
			System.out.print("Galleta SALADA en forma de Cuadrado con 4.0 ml sal se encuentra en la Posicion : ");
			System.out.println(bagSoda.getIndex(sal3));
			System.out.println(" ");
			System.out.println(" ");

			// Instanciaci�n de la clase generica para Sweet
			Bagg<Sweet> bagSweet = new Bagg<Sweet>(2);

			// Usando el metodo add
			Sweet dul1 = new Sweet(1, "Galleta", 1.8f, "Cuadrado", 9.2);
			Sweet dul2 = new Sweet(1, "Galleta", 1.8f, "Corazon", 8.1);
			Sweet dul3 = new Sweet(3, "Galleta", 1.7f, "Estrella", 7.0);
			bagSweet.add(dul2);
			bagSweet.add(dul3);
			System.out.println(bagSweet);

			// Usando el metodo getIndex
			System.out.print("Galleta DULCE en forma de Cuadrado con 9.2 ml azucar se encuentra en la Posicion : ");
			System.out.println(bagSweet.getIndex(dul1));
			System.out.print("Galleta DULCE en forma de Estrella con 7.0 ml azucar se encuentra en la Posicion : ");
			System.out.println(bagSweet.getIndex(dul3));

		} catch (IsFull | IsEmpty | ObjectNoExist exc) {
			System.out.println(exc.getMessage());
		}

	}

}