import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        while (true) {
            System.out.println("\n--- Sistema de Catálogo de Discos ---");
            System.out.println("1. Cadastrar Disco");
            System.out.println("2. Listar Discos");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Título do Disco: ");
                String titulo = scanner.nextLine();
                System.out.print("Ano de Lançamento: ");
                int ano = scanner.nextInt();
                scanner.nextLine();
                
                Disco novoDisco = new Disco(titulo, ano);
                catalogo.adicionarDisco(novoDisco);
            } else if (escolha == 2) {
                catalogo.listarDiscos();
            } else if (escolha == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
