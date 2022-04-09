public class SenhaMobile extends Senha{
    String app;
    public void aplicar(){
        
    }
    public SenhaMobile(String descricao, String login, String senha, String app) {
        super(descricao, login, senha);
        this.app = app;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
    
}
