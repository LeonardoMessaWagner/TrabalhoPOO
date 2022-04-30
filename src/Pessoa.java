public class Pessoa {
    // Enumeração da variavel Nivel
    public enum Nivel {
        Usuario, Administrador, Dono;
    }

    String nome;
    String email;
    private String CPF;
    private String login;
    private String senha;
    Nivel nivel;
    Boolean logado;

    // Construtor Pessoa
    public Pessoa(String nome, String email, String CPF, String login, String senha, Nivel nivel) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    // Nome get/set
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Email get/set
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // CPF get/set
    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    // Login get/set
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    // Senha get/set
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    // Nivel get/set
    public Nivel getNivel() { return nivel; }
    public void setNivel(Nivel nivel) { this.nivel = nivel; }
}
