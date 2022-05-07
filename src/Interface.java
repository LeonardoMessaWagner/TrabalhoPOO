import java.util.Scanner;

public class Interface {
    private Gerenciador m_Gerenciador = new Gerenciador();

    public void MostrarAções() 
    {
        if (m_Gerenciador.IsLogado()) 
        {
            if (m_Gerenciador.IsAdministrador()) 
            {
                System.out.print("1 - Sair\n");
                System.out.print("2 - Cadastrar Administrador\n");

                try (Scanner entrada = new Scanner(System.in))
                {
                    Integer Decisao = entrada.nextInt();
                    switch (Decisao)
                    {
                        case 1:
                        {
                            m_Gerenciador.Sair();
                            break;
                        }
                        case 2:
                        {
                            System.out.print("Nome: ");
                            String Nome = entrada.nextLine();
                            System.out.print("\nEmail: ");
                            String Email = entrada.nextLine();
                            System.out.print("\nCPF: ");
                            String CPF = entrada.nextLine();
                            System.out.print("\nLogin: ");
                            String Login = entrada.nextLine();
                            System.out.print("\nSenha: ");
                            String Senha = entrada.nextLine();

                            m_Gerenciador.Cadastrar(Nome, Email, CPF, Login, Senha, Pessoa.Nivel.Administrador);
                            break;
                        }
                    }
                }
            }
            else
            {
                System.out.print("1 - Sair\n");
                System.out.print("2 - Cadastrar Senha\n");
                System.out.print("3 - Aplicar Senha\n");

                try (Scanner entrada = new Scanner(System.in))
                {
                    Integer Decisao = entrada.nextInt();
                    switch (Decisao)
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
                            Integer SubDecisao = entrada.nextInt();
                            switch (SubDecisao)
                            {
                                case 1:
                                {
                                    System.out.print("Login: ");
                                    String Login = entrada.nextLine();
                                    System.out.print("\nSenha: ");
                                    String Senha = entrada.nextLine();
                                    System.out.print("\nDescrição: ");
                                    String Descricao = entrada.nextLine();
                                    System.out.print("\nWebsite: ");
                                    String Website = entrada.nextLine();

                                    m_Gerenciador.GetPessoaLogada().CadastrarSenhaWeb(new SenhaWeb(Login, Senha, Descricao, Website));
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Login: ");
                                    String Login = entrada.nextLine();
                                    System.out.print("\nSenha: ");
                                    String Senha = entrada.nextLine();
                                    System.out.print("\nDescrição: ");
                                    String Descricao = entrada.nextLine();
                                    System.out.print("\nApp: ");
                                    String App = entrada.nextLine();

                                    m_Gerenciador.GetPessoaLogada().CadastrarSenhaMobile(new SenhaMobile(Login, Senha, Descricao, App));
                                    break;
                                }
                            }
                        }
                        case 3:
                        {
                            System.out.print("1 - Aplicar Senha Web\n");
                            System.out.print("2 - Aplicar Senha Mobile\n");
                            Integer SubDecisao = entrada.nextInt();
                            subDecisao: switch (SubDecisao)
                            {
                                case 1:
                                {
                                    System.out.print("Website: ");
                                    String Website = entrada.nextLine();
                                    for (SenhaWeb senhaWeb : m_Gerenciador.GetPessoaLogada().getSenhasWeb())
                                    {
                                        if (senhaWeb.getSite() == Website) 
                                        {
                                            senhaWeb.aplicar();
                                            break subDecisao;
                                        }
                                    }
                                    System.out.print("Senha não encontrada!");
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Website: ");
                                    String App = entrada.nextLine();
                                    for (SenhaMobile senhaWeb : m_Gerenciador.GetPessoaLogada().getSenhasMobile())
                                    {
                                        if (senhaWeb.getApp() == App) 
                                        {
                                            senhaWeb.aplicar();
                                            break subDecisao;
                                        }
                                    }
                                    System.out.print("Senha não encontrada!");
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
        else
        {

            System.out.print(" 1 - Cadastre-se\n");
            System.out.print(" 2 - Login(se ja cadastrado)\n");

            try (Scanner entrada = new Scanner(System.in)) 
            {
                int decisao = entrada.nextInt();
                if (decisao == 1) {
                    System.out.print("Nome: ");
                    String Nome = entrada.nextLine();
                    System.out.print("\nEmail: ");
                    String Email = entrada.nextLine();
                    System.out.print("\nCPF: ");
                    String CPF = entrada.nextLine();
                    System.out.print("\nLogin: ");
                    String Login = entrada.nextLine();
                    System.out.print("\nSenha: ");
                    String Senha = entrada.nextLine();

                    m_Gerenciador.Cadastrar(Nome, Email, CPF, Login, Senha, Pessoa.Nivel.Usuario);
                } 
                else 
                {
                    System.out.print("Login: ");
                    String login = entrada.nextLine();
                    System.out.print("\n Senha: ");
                    String senha = entrada.nextLine();
                
                    m_Gerenciador.Logar(login, senha);
                }
            }
        }
    }
}
