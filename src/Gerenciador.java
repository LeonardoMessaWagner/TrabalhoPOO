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
            if (pessoa.getLogin().equals(login) && pessoa.getSenha().equals(senha))  
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
        return this.PessoaLogada;
    }

    public Boolean IsLogado()
    {
        return this.PessoaLogada != null;
    }
    
    public Boolean IsAdministrador()
    {
        return this.PessoaLogada.getNivel() == Pessoa.Nivel.Administrador;
    }

    public ArrayList<Pessoa> GetPessoas()
    {
        return this.Pessoas;
    }
}