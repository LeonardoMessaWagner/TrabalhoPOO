import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
    private Pessoa PessoaLogada;

    public Gerenciador() 
    {}

    public Integer Logar(String login, String senha)
    {
        for (Pessoa pessoa : Pessoas)
        {
            if (pessoa.getLogin() == login && pessoa.getSenha() == senha)  
            {
                this.PessoaLogada = pessoa;
                return 0;
            }
        }

        return -1;
    }

    public void Sair()
    {
        this.PessoaLogada = null;
    }

    public void Cadastrar(String nome, String email, String CPF, String login, String senha, Pessoa.Nivel nivel)
    {
        this.Pessoas.add(new Pessoa(nome, email, CPF, login, senha, nivel));
    }

    public Pessoa GetPessoaLogada()
    {
        return PessoaLogada;
    }

    public Boolean IsLogado()
    {
        return PessoaLogada != null;
    }
    
    public Boolean IsAdministrador()
    {
        return PessoaLogada.getNivel() == Pessoa.Nivel.Administrador;
    }
}
