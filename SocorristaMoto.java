public class SocorristaMoto extends Veiculo{
    public SocorristaMoto(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        super(velocidade, aceleracao, anguloDeVirada, placa);
    }

    public SocorristaMoto(String placa) {
        super(placa);
    }

    public void socorrer(Moto umaMoto){
        System.out.println("Socorrendo carro placa " + umaMoto.getPlaca());
    }
}
