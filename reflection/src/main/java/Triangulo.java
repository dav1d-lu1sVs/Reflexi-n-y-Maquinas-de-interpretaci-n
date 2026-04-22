public class Triangulo extends Figura {

    private int lado;

    public Triangulo() {
        this.nombre = "Triangulo";
    }

    @Override
    public Long perimetro() {
        return (long) (lado * 3);
    }

    @Override
    public Long area() {
        return (long) ((Math.sqrt(3) / 4) * lado * lado);
    }

    @Override
    public void setDefaultParams() {
        lado = 5;
    }
}