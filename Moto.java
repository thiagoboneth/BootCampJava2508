public class Moto extends Veiculo{
    public Moto(double velocidade, double aceleracao, double anguloDeVirada, String patente, int peso, int rodas) {
        super(velocidade, aceleracao, anguloDeVirada, patente, peso, rodas);
        peso = 300;
        rodas = 2;
    }
}
