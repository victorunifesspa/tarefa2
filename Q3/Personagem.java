package Q3;

class Personagem {
    public String nome;
    public String classe;
    public Arma arma;
    public boolean vivo;
    public Double energia;

    public Personagem(String nome, String classe, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
        this.vivo = true;
        this.energia = 100.0; // Energia inicial do personagem
    }

    public void entrarEmBatalha() {
        System.out.println(this.nome + " entrou em batalha com uma " + this.arma.tipo + "!");
    }

    public void atacar(Double intensidade) {
        if (this.vivo) {
            double custoEnergia = intensidade * 10; // Custo de energia proporcional à intensidade (exemplo)
            if (this.energia >= custoEnergia) {
                this.energia -= custoEnergia;
                double danoCausado = this.arma.dano * intensidade;
                System.out.println(this.nome + " atacou com " + this.arma.tipo + " e causou " + String.format("%.1f", danoCausado) + " de dano.");
                System.out.println("Energia restante: " + String.format("%.1f", this.energia));
            } else {
                System.out.println(this.nome + " não tem energia suficiente para atacar com essa intensidade.");
            }
        } else {
            System.out.println(this.nome + " não pode atacar, pois não está vivo.");
        }
    }
    
// Níveis de energia
    public int nivelDeEnergia() {
        if (this.energia == 0) {
            return 0;
        } else if (this.energia <= 20) {
            return 1;
        } else if (this.energia <= 40) {
            return 2;
        } else if (this.energia <= 60) {
            return 3;
        } else if (this.energia <= 80) {
            return 4;
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        // Criação da arma
        Arma espada = new Arma(50.0, "Espada");

        // Criação do personagem
        Personagem arthur = new Personagem("Arthur", "Guerreiro", espada);

        // Entrada em batalha
        arthur.entrarEmBatalha();

        // Ataque 1.0
        arthur.atacar(1.0); // Ataque com intensidade 1.0

        // Exibição nível de energia
        System.out.println("Nível de energia de " + arthur.nome + ": " + arthur.nivelDeEnergia());
    }
}