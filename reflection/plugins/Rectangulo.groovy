class Rectangulo extends Figura {

    int base
    int altura

    Rectangulo() {
        this.nombre = "Rectangulo"
    }

    Long perimetro() {
        return (long)(2 * (base + altura))
    }

    Long area() {
        return (long)(base * altura)
    }

    void setDefaultParams() {
        base = 5
        altura = 3
    }
}