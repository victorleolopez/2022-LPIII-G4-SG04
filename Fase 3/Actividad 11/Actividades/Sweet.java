public class Sweet extends Biscuits {

	private double cantAzucar;

	public Sweet(int id, String descripition, float price, String forma, double cantAzucar) {
		super(id, descripition, price, "Dulce", forma);
		this.cantAzucar = cantAzucar;
	}

	public double getCantAzucar() {
		return this.cantAzucar;
	}

	public void setCantAzucar(double cantAzucar) {
		this.cantAzucar = cantAzucar;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sweet) {
			Sweet sodaComparar = (Sweet) obj;
			return this.cantAzucar == sodaComparar.cantAzucar
					&& this.getForma().equals(sodaComparar.getForma());
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + "\tCantidad de Azucar: " + this.cantAzucar;
	}

}