public class SenhaMobile extends Senha{
    protected String app;

    // Construtor SenhaMobile
    public SenhaMobile(String descricao, String login, String senha, String app) {
        super(descricao, login, senha);
        this.app = app;
    }

    // Override do método aplicar
    public void aplicar() {
        System.out.printf("Login: %s\nSenha: %s\n  Resultado: Ok\n  Local: %s\n", this.login, this.senha, this.app);
    }

    // App get/set
    public String getApp() { return app; }
    public void setApp(String app) { this.app = app; }
    
}
