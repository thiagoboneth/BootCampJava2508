public class Moto extends Veiculo{

    double peso;
    int rodas;

    public Moto(int velocidade, int aceleracao, double anguloDeVirada, String placaMoto) {
        super(velocidade, aceleracao, anguloDeVirada, placaMoto);

        setPeso(300);
        setRodas(2);
    }

    public Moto(String placa) {
        super(placa);
    }
}
