//package aplication;
import model.UsuarioJogo;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo player1 = new UsuarioJogo("fernando","xXxKawaiiUchihaxXx");
        UsuarioJogo player2 = new UsuarioJogo("cris","zePilintra888");
        player1.setPontuacao(5000);
        player2.setPontuacao(8000);
        player1.setNivel(3);
        player2.setNivel(5);
        player1.aumentarPontuacao();
        player2.aumentarPontuacao();
        player2.bonus();
        System.out.println(player1.getNickname()+" possui "+player1.getPontuacao()+" pontos");
        System.out.println(player2.getNickname()+" possui "+player2.getPontuacao()+" pontos");
        System.out.println(player1.getNickname()+" está nivel: "+player1.getNivel());
        System.out.println(player2.getNickname()+" está nivel: "+player2.getNivel());
    }
}
