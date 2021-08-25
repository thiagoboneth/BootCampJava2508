public class Corrida {
    int distancia;
    int premioEmDolares;
    String nome;
    int quantidadeDeVeiculosPermitido;
    int listaDeVeiculos;

    public Corrida(int distancia, int premioEmDolares, String nome, int quantidadeDeVeiculosPermitido) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitido = quantidadeDeVeiculosPermitido;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeDeVeiculosPermitido=" + quantidadeDeVeiculosPermitido +
                ", listaDeVeiculos=" + listaDeVeiculos +
                '}';
    }
}