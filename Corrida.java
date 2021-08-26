import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Integer distancia = 1;
    private double premioEmDolares = 100;
    private String nomeCompeticao = "Rally da Palhoca";
    private Integer quantidadeMaximaDeVeiculo = 10;
    private SocorristaCarro socorristaCarro = new SocorristaCarro(100, 20, 90, "2424");
    private SocorristaMoto socorristaMoto = new SocorristaMoto(100, 20, 90, "2425");

    List<Veiculo> listaDeVeiculos = new ArrayList<>(quantidadeMaximaDeVeiculo);

    public void adicionarCarro(int velocidade, int aceleracao, double anguloDeVirada, String placaDeCarro) {
        if (isListaCheia()) {
            return;
        }
        Carro novoCarro = new Carro(velocidade, aceleracao, anguloDeVirada, placaDeCarro);
        listaDeVeiculos.add(novoCarro);
    }

    public void adicionarMoto(int velocidade, int aceleracao, double anguloDeVirada, String placaDeCarro) {
        if (isListaCheia()) {
            return;
        }
        Moto novaMoto = new Moto(velocidade, aceleracao, anguloDeVirada, placaDeCarro);
        listaDeVeiculos.add(novaMoto);
    }

    public boolean isListaCheia() {
        if (listaDeVeiculos.size() == quantidadeMaximaDeVeiculo) {
            System.out.println("Limite maximo de inscritos!");
            return true;
        }
        return false;
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaDeVeiculos.remove(veiculo);
        System.out.println("Veiculo removido, Placa " + veiculo.getPlaca());
    }

    public void removeVeiculoComPlaca(String placa) {
        Veiculo veiculo = new Veiculo(placa);
        listaDeVeiculos.remove(veiculo);
        System.out.println("Veiculo removido, Placa " + veiculo.getPlaca());
    }

    public Veiculo calculaVencedor() {
        Veiculo vencedor = null;
        double valorMaximo = 0.0;
        double valor = 0.0;
        for (Veiculo veiculo : listaDeVeiculos) {
            //Velocidade * 1⁄2 Aceleração / (AnguloDeVirada*(Peso - NumeroDeRodas * 100).
            valor = (veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao()) / (veiculo.getAnguloDeVirada() * (veiculo.getPeso() - veiculo.getRodas() * 100));
            if (valor > valorMaximo) {
                vencedor = veiculo;
                valorMaximo = valor;
            }
        }
        System.out.println("O vencedor foi " + vencedor.getPlaca() + " com o valor máximo = " + valorMaximo);
        return vencedor;
    }

    public void socorrerCarro(String placa) {
        socorristaCarro.socorrer(new Carro(placa));
        removeVeiculoComPlaca(placa);
        System.out.println(listaDeVeiculos.size());
    }

    public void socorrerMoto(String placa) {
        socorristaMoto.socorrer(new Moto(placa));
        removeVeiculoComPlaca(placa);
        System.out.println(listaDeVeiculos.size());
    }

}