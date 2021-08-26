import java.util.Objects;

public class Veiculo {
    private double velocidade;
    private double aceleracao;
    private double anguloDeVirada;
    private String placa;
    private int peso;
    private int rodas;

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.placa = placa;
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public void setAnguloDeVirada(double anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeVirada=" + anguloDeVirada +
                ", patente='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() && (o instanceof Veiculo) == false ) return false;
        Veiculo veiculo = (Veiculo) o;
        return this.placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, aceleracao, anguloDeVirada, placa, peso, rodas);
    }
}
