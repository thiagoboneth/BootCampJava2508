public class Carro extends Veiculo{

    public Carro(double velocidade, double aceleracao, double anguloDeVirada, String patente, int peso, int rodas) {
        super(velocidade, aceleracao, anguloDeVirada, patente, peso, rodas);
        peso = 1000;
        rodas = 4;
    }
}
