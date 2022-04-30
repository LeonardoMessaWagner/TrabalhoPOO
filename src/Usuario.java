import java.util.ArrayList;

public class Usuario extends Pessoa {
    String cartao;
    String endereco;
    ArrayList<Senha> ListaSenhas;

    // Construtor Usuario
    public Usuario(String nome, String email, String cpf, String login, String senha, Pessoa.Nivel nivel, String cartao, String endereco, ArrayList<Senha> listaSenhas) {
        super(nome, email, cpf, login, senha, nivel);
        this.cartao = cartao;
        this.endereco = endereco;
        ListaSenhas = listaSenhas;
    }

    // Cartão get/set
    public String getCartao() { return cartao; }
    public void setCartao(String cartao) { this.cartao = cartao; }

    // Endereço get/set
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    // ListaSenhas get/set
    public ArrayList<Senha> getListaSenhas() { return ListaSenhas; }
    public void setListaSenhas(ArrayList<Senha> listaSenhas) { ListaSenhas = listaSenhas; }
}
