public class Carro extends Veiculo {

    public Carro(int velocidade, int aceleracao, double anguloDeVirada, String placaDeCarro) {
        super(velocidade, aceleracao, anguloDeVirada, placaDeCarro);

        setPeso(1000);
        setRodas(4);
    }

    public Carro (String placa) {
        super(placa);
    }
}
