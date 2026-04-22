import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Class<?>> figuras = new ArrayList<>();

        try {
            figuras.add(Class.forName("Cuadrado"));
            figuras.add(Class.forName("Circulo"));
            figuras.add(Class.forName("Triangulo"));

            figuras.addAll(
                    GroovyFiguraLoader.cargarFiguras("plugins")
            );
            for (Class<?> clazz : figuras) {

                Figura fg =
                        (Figura) clazz.getDeclaredConstructor().newInstance();

                fg.setDefaultParams();

                System.out.println("Figura: " + fg.getNombre());
                System.out.println("Perimetro = " + fg.perimetro());
                System.out.println("Area = " + fg.area());
                System.out.println("-------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
