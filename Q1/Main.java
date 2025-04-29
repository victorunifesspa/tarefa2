package Q1;

public class Main {
    public static void main(String[] args) {
        // Objeto Circulo
        Circulo circulo = new Circulo(10, 15, 8);
        System.out.println("- Objeto Circulo -");
        circulo.mostrarEspecificidade();
        circulo.mostrarArea();
        System.out.println("Identidade: " + circulo + "\n");

        // Objetos Graficos
        Grafico graficoPreenchido = new Grafico(true, 'Δ');
        System.out.println("- Grafico Preenchido -");
        System.out.println("Preenchido: " + graficoPreenchido.preenchido);
        System.out.println("Caractere: " + graficoPreenchido.caractere + "\n");

        Grafico graficoNaoPreenchido = new Grafico(false, '*');
        System.out.println("- Grafico Não Preenchido -");
        System.out.println("Preenchido: " + graficoNaoPreenchido.preenchido);
        System.out.println("Caractere: " + graficoNaoPreenchido.caractere);

        // Objeto Potencia
        Potencia potencia = new Potencia(1, 5);

        // Conecta o primeiro gráfico e chama apresenta()
        System.out.println("\n");
        potencia.conecta(graficoPreenchido);
        potencia.apresenta();

        // Conecta o segundo gráfico e chama novamente apresenta()
        System.out.println("\n");
        potencia.conecta(graficoNaoPreenchido);
        potencia.apresenta();
    }
}