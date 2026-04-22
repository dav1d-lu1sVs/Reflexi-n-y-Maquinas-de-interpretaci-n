public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado() {
        this.nombre = "Cuadrado";
    }

    @Override
    public Long perimetro() {
        return (long) (lado * 4);
    }

    @Override
    public Long area() {
        return (long) (lado * lado);
    }

    @Override
    public void setDefaultParams() {
        lado = 4;
    }
}