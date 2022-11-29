public class frunas {
    private String sabor;

    public frunas(int id, String descripition, float price, String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chocolates) {
            Chocolates frunaComparar = (Chocolates) obj;
            return this.sabor.equals(frunaComparar.getSabor());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSabor: " + this.sabor;
    }

}
