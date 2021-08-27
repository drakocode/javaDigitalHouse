package model;

public class UsuarioJogo {

    //variaveis
    private String nome;
    private String nickname;
    private Integer pontuacao;
    private Integer nivel;


    //constructor
    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
        pontuacao = 0;
        nivel = 1;
    }

    //procedimento=== não retorna nada mas faz uma função
    public void aumentarPontuacao(){
        pontuacao+=500;
        //pontuacao=pontuacao+500;

    }


    //methods section
    public void subirNivel(){
        nivel++;
    }

    public void bonus(){
        pontuacao+=300;
    }


    //getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
