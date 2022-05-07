import java.util.ArrayList;

public class Pessoa {
    // Enumeração da variavel Nivel
    public enum Nivel 
    {
        Usuario, Administrador;
    }

    private ArrayList<SenhaWeb> SenhasWeb = new ArrayList<SenhaWeb>();
    private ArrayList<SenhaMobile> SenhasMobile = new ArrayList<SenhaMobile>();

    private String nome;
    private String email;
    private String CPF;
    private String login;
    private String senha;
    private Nivel nivel;

    // Construtor Pessoa
    public Pessoa(String nome, String email, String CPF, String login, String senha, Nivel nivel) 
    {
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

    // Cadastrar Senha Web
    public void CadastrarSenhaWeb(SenhaWeb senhaWeb)
    {
        SenhasWeb.add(senhaWeb);
    }

    // SenhasWeb get
    public ArrayList<SenhaWeb> getSenhasWeb()
    {
        return SenhasWeb;
    }

    // Cadastrar Senha Mobile
    public void CadastrarSenhaMobile(SenhaMobile senhaMobile)
    {
        SenhasMobile.add(senhaMobile);
    }

    // SenhasMobile get
    public ArrayList<SenhaMobile> getSenhasMobile()
    {
        return SenhasMobile;
    }
}
