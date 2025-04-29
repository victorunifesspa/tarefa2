package Q2;

class Carro {
    public String cor;
    public String modelo;
    public Double velocidadeAtual;
    public Double velocidadeMaxima;
    public Motor motor;
    public boolean ligado;

    public Carro(String cor, String modelo, Double velocidadeMaxima, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.motor = motor;
        this.ligado = false;
    }

    public void liga() {
        this.ligado = true;
        System.out.println("Carro ligado!");
    }

    public void acelera(Double qtd) {
        if (this.ligado) {
            this.velocidadeAtual += qtd;
            if (this.velocidadeAtual > this.velocidadeMaxima) {
                this.velocidadeAtual = this.velocidadeMaxima;
                System.out.println("Atingiu a velocidade máxima: " + this.velocidadeMaxima + " km/h.");
            } else {
                System.out.println("Acelerando: " + qtd + " km/h. Velocidade atual: " + this.velocidadeAtual + " km/h.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public int pegaMarcha() {
        if (this.velocidadeAtual == 0) {
            return 0;
        } else if (this.velocidadeAtual <= 20) {
            return 1;
        } else if (this.velocidadeAtual <= 40) {
            return 2;
        } else if (this.velocidadeAtual <= 60) {
            return 3;
        } else if (this.velocidadeAtual <= 80) {
            return 4;
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        // Objeto Motor
        Motor motorJeep = new Motor(1.6, "Gasolina");

        // Objeto Carro
        Carro jeep = new Carro("Verde", "Jeep", 120.0, motorJeep);

        // Ligação do carro
        jeep.liga();

        // Aceleração e exibição da marcha
        jeep.acelera(10.0);
        System.out.println("Marcha atual: " + jeep.pegaMarcha());

        jeep.acelera(35.0);
        System.out.println("Marcha atual: " + jeep.pegaMarcha());

        // Exibição do modelo e potência
        System.out.println("Potência do motor: " + jeep.motor.potencia);
    }
}