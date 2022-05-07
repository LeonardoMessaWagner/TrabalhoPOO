import java.util.Scanner;

public class Interface {
    private Gerenciador m_Gerenciador = new Gerenciador();
    private Scanner Entrada = new Scanner(System.in);

    public void MostrarAções() 
    {
        if (m_Gerenciador.IsLogado()) 
        {
            if (m_Gerenciador.IsAdministrador()) 
            {
                System.out.print("1 - Sair\n");
                System.out.print("2 - Cadastrar Administrador\n");
                
                Integer Decisao = Integer.parseInt(Entrada.nextLine());
                decisao: switch (Decisao)
                {
                    case 1:
                    {
                        m_Gerenciador.Sair();
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Nome: ");
                        String Nome = Entrada.nextLine();
                        System.out.print("Email: ");
                        String Email = Entrada.nextLine();
                        System.out.print("CPF: ");
                        String CPF = Entrada.nextLine();
                        System.out.print("Login: ");
                        String Login = Entrada.nextLine();
                        System.out.print("Senha: ");
                        String Senha = Entrada.nextLine();

                        m_Gerenciador.Cadastrar(Nome, Email, CPF, Login, Senha, Pessoa.Nivel.Administrador);
                        break;
                    }
                }
                
            }
            else
            {
                System.out.print("1 - Sair\n");
                System.out.print("2 - Cadastrar Senha\n");
                System.out.print("3 - Aplicar Senha\n");

                
                Integer Decisao = Integer.parseInt(Entrada.nextLine());
                decisao: switch (Decisao)
                {
                    case 1:
                    {
                        m_Gerenciador.Sair();
                        break;
                    }
                    case 2:
                    {
                        System.out.print("1 - Cadastrar Senha Web\n");
                        System.out.print("2 - Cadastrar Senha Mobile\n");
                        Integer SubDecisao = Entrada.nextInt();
                        switch (SubDecisao)
                        {
                            case 1:
                            {
                                System.out.print("Login: ");
                                String Login = Entrada.nextLine();
                                System.out.print("Senha: ");
                                String Senha = Entrada.nextLine();
                                System.out.print("Descrição: ");
                                String Descricao = Entrada.nextLine();
                                System.out.print("Website: ");
                                String Website = Entrada.nextLine();

                                m_Gerenciador.GetPessoaLogada().CadastrarSenhaWeb(new SenhaWeb(Login, Senha, Descricao, Website));
                                break decisao;
                            }
                            case 2:
                            {
                                System.out.print("Login: ");
                                String Login = Entrada.nextLine();
                                System.out.print("Senha: ");
                                String Senha = Entrada.nextLine();
                                System.out.print("Descrição: ");
                                String Descricao = Entrada.nextLine();
                                System.out.print("App: ");
                                String App = Entrada.nextLine();

                                m_Gerenciador.GetPessoaLogada().CadastrarSenhaMobile(new SenhaMobile(Login, Senha, Descricao, App));
                                break decisao;
                            }
                        }
                    }
                    case 3:
                    {
                        System.out.print("1 - Aplicar Senha Web\n");
                        System.out.print("2 - Aplicar Senha Mobile\n");
                        Integer SubDecisao = Integer.parseInt(Entrada.nextLine());
                        switch (SubDecisao)
                        {
                            case 1:
                            {
                                System.out.print("Website: ");
                                String Website = Entrada.nextLine();
                                for (SenhaWeb senhaWeb : m_Gerenciador.GetPessoaLogada().getSenhasWeb())
                                {
                                    if (senhaWeb.getSite().equals(Website)) 
                                    {
                                        senhaWeb.aplicar();
                                        break decisao;
                                    }
                                }
                                System.out.print("Senha não encontrada!");
                                break decisao;
                            }
                            case 2:
                            {
                                System.out.print("Website: ");
                                String App = Entrada.nextLine();
                                for (SenhaMobile senhaWeb : m_Gerenciador.GetPessoaLogada().getSenhasMobile())
                                {
                                    if (senhaWeb.getApp().equals(App)) 
                                    {
                                        senhaWeb.aplicar();
                                        break decisao;
                                    }
                                }
                                System.out.print("Senha não encontrada!");
                                break decisao;
                            }
                        }
                        break;
                    }
                }
            }
        }
        else
        {

            System.out.print(" 1 - Cadastre-se\n");
            System.out.print(" 2 - Login(se ja cadastrado)\n");

            Integer Decisao = Integer.parseInt(Entrada.nextLine());
            switch (Decisao)
            {
                case 1:
                {
                    System.out.print("Nome: ");
                    String Nome = Entrada.nextLine();
                    System.out.print("Email: ");
                    String Email = Entrada.nextLine();
                    System.out.print("CPF: ");
                    String CPF = Entrada.nextLine();
                    System.out.print("Login: ");
                    String Login = Entrada.nextLine();
                    System.out.print("Senha: ");
                    String Senha = Entrada.nextLine();

                    m_Gerenciador.Cadastrar(Nome, Email, CPF, Login, Senha, Pessoa.Nivel.Usuario);
                    break;
                }
                case 2:
                {
                    System.out.print("Login: ");
                    String login = Entrada.nextLine();
                    System.out.print("Senha: ");
                    String senha = Entrada.nextLine();
                    
                    m_Gerenciador.Logar(login, senha);
                    break;
                }
            }
        }
    }
}
