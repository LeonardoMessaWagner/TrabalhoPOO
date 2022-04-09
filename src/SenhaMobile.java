public class SenhaMobile extends Pessoa{
    String app;
    public SenhaMobile(String nome, String email, String cPF, String login, String senha, Pessoa.Nivel nivel,
            String app) {
        super(nome, email, cpf, login, senha, nivel);
        this.app = app;
    }
    public void aplicar() {
        
    }
    public String getApp() {
        return app;
    }
    public void setApp(String app) {
        this.app = app;
    }
}
