package Q1;

class Circulo {
    int x;
    int y;
    int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void mostrarArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }

    public void mostrarEspecificidade() {
        System.out.println("Centro: (" + this.x + ", " + this.y + ")");
        System.out.println("Raio: " + this.raio);
    }
}