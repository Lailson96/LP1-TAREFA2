import java.util.Scanner;

public class Usuario {
    private String usuario1;
    private String usuario2;
    private String usuario3;
    private String usuario4;
    public String usuario5;
    public String usuarioEscolhido;
    private int idade;

    // Construtor com parâmetros
    public Usuario(String usuario1, String usuario2, String usuario3, String usuario4, String usuario5, String humor) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.usuario3 = usuario3;
        this.usuario4 = usuario4;
        this.usuario5 = usuario5;
        this.usuarioEscolhido=usuarioEscolhido;
        this.idade = 0;
    }

    // Construtor sem parâmetros
    public Usuario() {
        this.usuario1 = "Jesus";
        this.usuario2 = "Maria";
        this.usuario3 = "José";
        this.usuario4 = "João";
        this.usuario5 = "Edwirges";
        this.usuarioEscolhido= "";
        this.idade=0;
    }


    public String selecionaUsuario() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nBem vindo\nSelecione um usuario para assistir filme :");
            System.out.println("1. " + usuario1);
            System.out.println("2. " + usuario2);
            System.out.println("3. " + usuario3);
            System.out.println("4. " + usuario4);
            System.out.println("5. " + usuario5);
            System.out.println("6. Sair");

            // Lendo a opção do usuário
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    this.usuarioEscolhido = usuario1;  // Atualiza o atributo de instância
                    break;
                case 2:

                    this.usuarioEscolhido = usuario2;  // Atualiza o atributo de instância
                    break;
                case 3:

                    this.usuarioEscolhido = usuario3;  // Atualiza o atributo de instância
                    break;
                case 4:

                    this.usuarioEscolhido = usuario4;  // Atualiza o atributo de instância
                    break;
                case 5:
                    this.usuarioEscolhido = usuario5;  // Atualiza o atributo de instância
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um valor válido.");
            }

            System.out.println();
        } while (option <0);
        return usuarioEscolhido;
    }
    public void verificaIdade(){

        Scanner sc= new Scanner(System.in);
        int idade= sc.nextInt();
        if(idade>18){
            System.out.println("Pode continuar: ");

        }
        else{
            System.out.println("Chame um adulto para continuar: ");
            System.exit(0);

        }



    }


}
