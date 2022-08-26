import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Cria um novo Array
        ArrayList<User> users = new ArrayList();

        boolean run = true;

        while (run) {
            // Opções de controle
            System.out.println("");
            System.out.println("----| Opções de Controle |----");
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Ver lista de usuários");
            System.out.println("[3] Procurar usuário por nome");
            System.out.println("[4] Atualizar usuário");
            System.out.println("[5] Remover usuário");
            System.out.println("[6] Sair");
            // Usuário digita alguma opção de controle
            System.out.print("Digite uma opção: ");
            // Opção selecionada fica armazenada na variável opcao
            String opcao = scanner.nextLine();

            // Lista os casos de controle
            switch (opcao) {

                // Cria um usuário
                case "1": {
                    System.out.println("----| Registro de Usuário |----");
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite seu sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    System.out.print("Digite seu e-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Crie seu usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Crie sua senha: ");
                    String senha = scanner.nextLine();
                    // Atribui cada valor para a criação de um novo usuário. "u" = usuário
                    User u = new User();
                    u.atribuirNome(nome);
                    u.atribuirSobrenome(sobrenome);
                    u.atribuirEmail(email);
                    u.atribuirUsuario(usuario);
                    u.atribuirSenha(senha);

                    // Adiciona os valores ao usuário
                    users.add(u);
                    break;
                }

                // Exibe uma lista de usuário ja cadastrados
                case "2": {
                    System.out.println("----| Usuários |----");
                    for (int i = 0; i < users.size(); i++) {

                        User temp = users.get(i);
                        System.out.println("Usuário " + i);
                        System.out.println("\tNome: " + users.get(i).pegarNome());
                        System.out.println("\tSobrenome: " + users.get(i).pegarSobrenome());
                        System.out.println("\tE-mail: " + users.get(i).pegarEmail());
                        System.out.println("\tUsuário: " + users.get(i).pegarUsuario());
                        System.out.println("\tSenha: " + users.get(i).pegarSenha());
                    }
                    break;
                }

                // Busca por usuário cadastrados e não cadastrados
                case "3": {
                    System.out.println("----| Busca de Usuários |----");
                    // Digita a pesquisa pelo nome
                    System.out.print("Digite um nome: ");
                    String nome = scanner.nextLine();

                    boolean finded = false;

                    for (int i = 0; i < users.size(); i++) {

                        User temp = users.get(i);

                        // Caso a pesquisa tenha um valor verdadeiro, as informações do usuário serão
                        // mostrados
                        if (nome.equals(temp.pegarNome())) {
                            System.out.println("----| Usuário encontrado |----");
                            System.out.println("\tNome: " + temp.pegarNome());
                            System.out.println("\tSobrenome: " + temp.pegarSobrenome());
                            System.out.println("\tE-mail: " + temp.pegarEmail());
                            System.out.println("\tUsuário: " + temp.pegarUsuario());
                            System.out.println("\tSenha: " + temp.pegarSenha());
                            finded = true;
                            break;
                        }

                    }

                    // Caso a pesquisa tenha um valor falso, será exibido a seguinte mensagem:
                    // Nenhum usuário encontrado com o nome: "pesquisa"
                    if (finded == false) {
                        System.out.println("\tNenhum usuário encontrado com o nome: " + nome);
                    }

                    break;
                }

                // Atualiza o cadastro do usuário, e-mail, senha e usuário
                case "4": {
                    System.out.println("----| Atualização de cadastro |----");
                    for (int i = 0; i < users.size(); i++) {

                        User temp = users.get(i);

                        System.out.println("[" + i + "]" + temp.pegarNome());

                    }

                    // Digita a posição(id) do usuário
                    System.out.print("Digite o id do usuário: ");
                    int id = scanner.nextInt();
                    // Limpa o buffer
                    scanner.nextLine();

                    // É digitado os novos valores e armazenados em novos atributos
                    System.out.print("Novo e-mail: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Novo usuário: ");
                    String novoUsuario = scanner.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = scanner.nextLine();

                    // Os novos valores são atribuidos
                    User u = users.get(id);
                    u.atribuirEmail(novoEmail);
                    u.atribuirUsuario(novoUsuario);
                    u.atribuirSenha(novaSenha);

                    break;
                }

                // Deleta usuário
                case "5": {
                    System.out.println("----| Deletar Usuário |----");

                    for (int i = 0; i < users.size(); i++) {

                        User temp = users.get(i);

                        System.out.println("[" + i + "]" + temp.pegarNome());

                    }

                    // Digita a posição(id) do usuário
                    System.out.print("Digite o id do usuário: ");
                    int id = scanner.nextInt();
                    // Limpa o buffer
                    scanner.nextLine();

                    // Remove o usuário
                    users.remove(id);
                    System.out.println("Usuário removido com sucesso!");

                    break;
                }

                // Encerra o programa
                case "6": {
                    run = false;
                    break;
                }

            }

        }

    }
}
