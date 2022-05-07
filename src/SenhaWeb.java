public class SenhaWeb extends Senha {
    protected String site;

    // Construtor SenhaWeb
    public SenhaWeb(String descricao, String login, String senha, String site) {
        super(descricao, login, senha);
        this.site = site;
    }

    // Override to método aplicar
    public void aplicar(){
        System.out.printf("Login: %s\nSenha: %s\n  Resultado: Ok\n  Local: %s\n", this.login, this.senha, this.site);
    }
    
    // Site get/set
    public String getSite() { return site; }
    public void setSite(String site) { this.site = site;}
}
