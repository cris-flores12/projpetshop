/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author crisf
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    private static ArrayList<Dono> listaDonos = new ArrayList<>();
    private static ArrayList<Animal> listaAnimais = new ArrayList<>();
    private static ArrayList<Atendimento> listaAtendimentos = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        System.out.println("--- BEM-VINDO AO PET SHOP JAVA ---");

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(leitor.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarDono();
                    break;
                case 2:
                    cadastrarAnimal();
                    break;
                case 3:
                    registrarAtendimento();
                    break;
                case 4:
                    listarAnimais();
                    break;
                case 5:
                    exibirAtendimentos();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar dono");
        System.out.println("2. Cadastrar animal");
        System.out.println("3. Registrar atendimento");
        System.out.println("4. Listar animais");
        System.out.println("5. Exibir atendimentos");
        System.out.println("6. Encerrar");
    }

    private static void cadastrarDono() {
        System.out.print("Nome do dono: ");
        String nome = leitor.nextLine();
        System.out.print("CPF do dono: ");
        String cpf = leitor.nextLine();

        Dono novoDono = new Dono(nome, cpf);
        listaDonos.add(novoDono);
        System.out.println("Dono cadastrado com sucesso!");
    }

    private static void cadastrarAnimal() {
        if (listaDonos.isEmpty()) {
            System.out.println("Erro: Cadastre um dono primeiro!");
            return;
        }

        System.out.println("Escolha o dono pelo número:");
        for (int i = 0; i < listaDonos.size(); i++) {
            System.out.println(i + " - " + listaDonos.get(i).getNome());
        }
        int indexDono = Integer.parseInt(leitor.nextLine());
        Dono donoSelecionado = listaDonos.get(indexDono);

        System.out.print("Nome do animal: ");
        String nome = leitor.nextLine();
        System.out.print("Idade do animal: ");
        int idade = Integer.parseInt(leitor.nextLine());

        System.out.println("Tipo do animal: 1-Cachorro, 2-Gato, 3-Passaro");
        int tipo = Integer.parseInt(leitor.nextLine());

        Animal novoAnimal = null;
        if (tipo == 1) {
            novoAnimal = new Cachorro(nome, idade, donoSelecionado);
        } else if (tipo == 2) {
            novoAnimal = new Gato(nome, idade, donoSelecionado);
        } else if (tipo == 3) {
            novoAnimal = new Passaro(nome, idade, donoSelecionado);
        }

        if (novoAnimal != null) {
            listaAnimais.add(novoAnimal);
            System.out.println(nome + " cadastrado com sucesso!");
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private static void registrarAtendimento() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Erro: Cadastre um animal primeiro!");
            return;
        }

        System.out.println("Escolha o animal pelo número:");
        for (int i = 0; i < listaAnimais.size(); i++) {
            System.out.println(i + " - " + listaAnimais.get(i).getNome());
        }
        int indexAnimal = Integer.parseInt(leitor.nextLine());
        Animal animalSelecionado = listaAnimais.get(indexAnimal);

        System.out.print("Descrição do serviço (ex: Banho e Tosa): ");
        String descricao = leitor.nextLine();

        Atendimento novoAtendimento = new Atendimento(animalSelecionado, descricao);
        listaAtendimentos.add(novoAtendimento);
        
        System.out.println("Atendimento registrado!");
        novoAtendimento.exibirResumo();
    }

    private static void listarAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal a : listaAnimais) {
            a.exibirDados();
            System.out.println("--------------------");
        }
    }

    private static void exibirAtendimentos() {
        if (listaAtendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento registrado.");
            return;
        }
        for (Atendimento at : listaAtendimentos) {
            at.exibirResumo();
        }
    }
}
