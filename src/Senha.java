public class Senha {

    String descricao;
    String login;
    String senha;
    
    

    public Senha(String descricao, String login, String senha) {
        this.descricao = descricao;
        this.login = login;
        this.senha = senha;
    }



    public void Aplicar() {

    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

   
}
