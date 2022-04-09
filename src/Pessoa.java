public class Pessoa {
    public enum Nivel {
        Usuario, Administrador, Dono;
    }

    public static final String Pessoa = null;

    String nome;
    String email;
    private final  String cpf;
    private String login;
    private String senha;
    Nivel nivel;

    public void Entrar() {

    }

    public void Sair() {

    }

    public Pessoa(String nome, String email, String cpf, String login, String senha, Nivel nivel) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

}
