public class Manejador {

    public static double area(int CompX, int CompY) {
        double area, altura, base;
        Rectangulo R = new Rectangulo(CompX, CompY);
        altura = Coordenada.distancia(R.getEsquina1());
        base = Coordenada.distancia(R.getEsquina2());
        area = altura * base;
        return area;
    }

    public static double perimetro(int CompX, int CompY) {
        double Perimetro, altura, base;
        Rectangulo R = new Rectangulo(CompX, CompY);
        altura = Coordenada.distancia(R.getEsquina1());
        base = Coordenada.distancia(R.getEsquina2());
        Perimetro = (altura * 2) + (base * 2);
        return Perimetro;
    }

    public static void moverX(int num, int CompX, int CompY) {
        Coordenada nuevoX;
        Rectangulo R = new Rectangulo(CompX + num, CompY);
        nuevoX = R.getEsquina1();
        nuevoX.setx(num);
        System.out.println(R.getEsquina1());
        System.out.println(R.getEsquina2());
    }

    public static void moverY(int num, int CompX, int CompY) {
        Coordenada nuevoY;
        Rectangulo R = new Rectangulo(CompX, CompY + num);
        nuevoY = R.getEsquina2();
        nuevoY.setY(num);
        System.out.println(R.getEsquina1());
        System.out.println(R.getEsquina2());
    }

}
