package Q1;

class Potencia {
    int inicial;
    int quantidade;
    Grafico saida;

    public Potencia(int inicial, int quantidade) {
        this.inicial = inicial;
        this.quantidade = quantidade;
        this.saida = null;
    }

    public void conecta(Grafico saida) {
        this.saida = saida;
    }

    public void apresenta() {
        if (this.saida != null) {
            int valorAtual = this.inicial;
            for (int i = 0; i < this.quantidade; i++) {
                this.saida.plota(valorAtual);
                valorAtual *= 2;
            }
        } else {
            System.out.println("Nenhum gráfico conectado para apresentação.");
        }
    }
}