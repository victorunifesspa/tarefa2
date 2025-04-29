package Q1;

class Grafico {
    boolean preenchido;
    char caractere;

    public Grafico(boolean preenchido, char caractere) {
        this.preenchido = preenchido;
        this.caractere = caractere;
    }

    public void plota(int valor) {
        String linha = "";
        if (preenchido) {
            for (int i = 0; i < valor; i++) {
                linha += caractere;
            }
        } else {
            for (int i = 0; i < valor - 1; i++) {
                linha += " ";
            }
            if (valor > 0) {
                linha += caractere;
            }
        }
        System.out.println(linha);
    }
}