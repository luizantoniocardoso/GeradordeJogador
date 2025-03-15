import java.util.Random;

public class Main {
    static String[] nomes = {"tiago", "artur", "felipe"};
    static String[] times = {"Vasco", "Gremio", "Criciuma"};
    static String[] posicao = {"Atacante", "Goleiro", "Zagueiro"};

    public static void main(String[] args) {
        for (String nome : nomes){
            Jogador jogador = gerarJogador(nome);
            jogador.apresentar();
        }
    }

    static Jogador gerarJogador(String nome){
        Random gerador = new Random();
        Jogador jogador = new Jogador();
        jogador.nome = nome;
        jogador.time = times[gerador.nextInt(times.length)];
        jogador.posicao = posicao[gerador.nextInt(posicao.length)];
        jogador.camisa = gerador.nextInt(11);
        jogador.idade = gerador.nextInt(18,40);
        return jogador;
    }

}