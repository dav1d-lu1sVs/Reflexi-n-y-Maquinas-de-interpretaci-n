public class Circulo extends Figura {

    private int radio;

    public Circulo() {
        this.nombre = "Circulo";
    }

    @Override
    public Long perimetro() {
        return (long) (2 * Math.PI * radio);
    }

    @Override
    public Long area() {
        return (long) (Math.PI * radio * radio);
    }

    @Override
    public void setDefaultParams() {
        radio = 3;
    }
}