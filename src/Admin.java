public class Admin extends Pessoa {

    String[] ListaTarefas;

    public Admin(String nome, String email, String cPF, String login, String senha, Pessoa.Nivel nivel,
            String[] listaTarefas) {
        super(nome, email, cPF, login, senha, nivel);
        ListaTarefas = listaTarefas;
    }

}
