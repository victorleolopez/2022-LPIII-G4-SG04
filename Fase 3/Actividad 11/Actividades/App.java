public class App {
    public static void main(String[] args) {
        Integer[] x = { 0, 1, 2, 3, 4 };
        Verificadora<Integer> ver = new Verificadora<Integer>(x);
        String msg = ver.contiene(2) ? "SI tiene 2" : "NO tiene 2";
        System.out.println(msg);
        msg = ver.contiene(6) ? "SI tiene 6" : "NO tiene 6";
        System.out.println(msg);

        Persona[] lpersona = { new Persona("Johan", "Comercio #127", "956557395"),
                new Persona("isabel", "Comercio #127", "956557395") };
        Verificadora<Persona> verpe = new Verificadora<Persona>(lpersona);
        Persona p = new Persona("Johann", "Comercio #127", "956557395");
        msg = verpe.contiene(p) ? "SI tiene Nombre " + p.getNombres() : "NO tiene Nombre " + p.getNombres();
        System.out.println(msg);

        Goodies[] lgoodies = { new Goodies(71, "Caramelos", 7.5f), new Goodies(100, "galleta", 1.5f) };
        Verificadora<Goodies> ver_goo = new Verificadora<Goodies>(lgoodies);
        Goodies g = new Goodies(72, "Caramelos", 7.5f);
        msg = ver_goo.contiene(g) ? "SI tiene codigo " + g.getId() : "NO tiene codigo " + g.getId();
        System.out.println(msg);

        Estudiante[] lestu = { new Estudiante("Johann", "Comercio #127", "956557395", "Sistemas",
                new Procedencia("Arequipa", "Arequipa")),new Estudiante("Victor", "Arequipa #127", "963521448", "Sistemas",
                new Procedencia("Arequipa", "Arequipa")) };
        Verificadora<Estudiante> verest = new Verificadora<Estudiante>(lestu);
        Estudiante e = new Estudiante("Johan", "Comercio #127", "956557395", "Sistemas",
        new Procedencia("Arequipa", "Arequipa"));
        msg = verest.contiene(e) ? "SI tiene codigo " + e.getNombres() + " " + e.getProcedencia()
                : "NO tiene codigo " + e.getNombres() + e.getProcedencia();
        System.out.println(msg);        
    }
}
