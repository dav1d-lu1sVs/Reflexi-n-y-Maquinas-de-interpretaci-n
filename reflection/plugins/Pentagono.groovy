class Pentagono extends Figura {

    int lado

    Pentagono() {
        this.nombre = "Pentagono"
    }

    Long perimetro() {
        return lado * 5
    }

    Long area() {
        return (long)((5 * lado * lado) / (4 * Math.tan(Math.PI/5)))
    }

    void setDefaultParams() {
        lado = 6
    }
}