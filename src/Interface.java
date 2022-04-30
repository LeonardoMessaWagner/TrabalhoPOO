import java.util.Scanner;

public class Interface {

    public void MostrarAções() {
        System.out.print(" 1 - Cadastre-se\n");
        System.out.print(" 2 - Login(se ja cadastrado)\n");

        try (Scanner entrada = new Scanner(System.in)) {
            int decisao = entrada.nextInt();
            if (decisao == 1) {
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("\nE-mail: ");
                String email = entrada.nextLine();
                System.out.print("\nCPF: ");
                String cpf = entrada.nextLine();
                System.out.print("\nSenha>: ");
                String senha = entrada.nextLine();

            } else {
                System.out.print("Login: ");
                String login = entrada.nextLine();
                System.out.print("\n Senha: ");
                String senha = entrada.nextLine();
               

            }
        }
    }
}
