import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        Corrida corrida = new Corrida();
        corrida.adicionarCarro(100, 10, 90.0, "2424");
        corrida.adicionarCarro(150, 5, 160.0, "6969");
        corrida.adicionarCarro(120, 8, 90.0, "2525");
        corrida.adicionarCarro(115, 12, 90.0, "2828");
        corrida.adicionarCarro(180, 5, 90.0, "6666");
        corrida.adicionarMoto(250, 10, 90.0, "2727");
        corrida.adicionarMoto(120, 8, 90.0, "2789");
        corrida.adicionarMoto(120, 6, 90.0, "1975");
        corrida.adicionarMoto(165, 8, 90.0, "2876");
        corrida.adicionarMoto(190, 8, 90.0, "8927");
        corrida.adicionarMoto(120, 6, 90.0, "9999");

        corrida.socorrerCarro("2525");
        corrida.socorrerMoto("2876");

        corrida.calculaVencedor();

    }
}