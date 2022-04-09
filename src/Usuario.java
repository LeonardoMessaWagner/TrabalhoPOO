public class Usuario extends Pessoa {

    public Usuario(String nome, String email, String cpf, String login, String senha, Pessoa.Nivel nivel) {
        super(nome, email, cpf, login, senha, nivel);
        
    }
    String cartao;
    String endereco;
    String[] ListaSenhas;
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String[] getListaSenhas() {
        return ListaSenhas;
    }
    public void setListaSenhas(String[] listaSenhas) {
        ListaSenhas = listaSenhas;
    }

    
}
