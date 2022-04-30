public abstract class Senha {
    protected String descricao;
    protected String login;
    protected String senha;
    
    // Construtor Senha
    public Senha(String descricao, String login, String senha) {
        this.descricao = descricao;
        this.login = login;
        this.senha = senha;
    }

    // Método abstrato aplicar
    abstract public void aplicar();

    // Descricao get/set
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    
    // Login get/set
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    // Senha get/set
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
