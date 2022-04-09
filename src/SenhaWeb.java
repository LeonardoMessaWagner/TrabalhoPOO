public class SenhaWeb extends Senha {
    String site;
    public SenhaWeb(String descricao, String login, String senha, String site) {
        super(descricao, login, senha);
        this.site = site;
    }
    public void aplicar(){
        
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
}
