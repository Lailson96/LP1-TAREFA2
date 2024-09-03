import java.util.Scanner;

public class ComediaFilme {
    private String filme1;
    private String filme2;
    private String filme3;
    private String filme4;
    public String comediaEscolhida;
    private int classificacao;

    // Construtor com parâmetros
    public ComediaFilme(String filme1, String filme2, String filme3, String filme4, String filmeEscolhido, String humor) {
        this.filme1 = filme1;
        this.filme2 = filme2;
        this.filme3 = filme3;
        this.filme4 = filme4;
        this.comediaEscolhida = ""; // Inicializado como vazio
        this.classificacao = 0; // Inicializado como vazio
    }

    // Construtor sem parâmetros
    public ComediaFilme() {
        this.filme1 = "Um tira da pesada";
        this.filme2 = "A liga";
        this.filme3 = "Ferdinand";
        this.filme4 = "Segurança nacional";
        this.comediaEscolhida = "";
        this.classificacao=0;

    }



    public String selecionaComedia() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Selecione um filme de comédia :");
            System.out.println("1. " + filme1);
            System.out.println("2. " + filme2);
            System.out.println("3. " + filme3);
            System.out.println("4. " + filme4);
            System.out.println("5. Sair");

            // Lendo a opção do usuário
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    this.comediaEscolhida = filme1;  // Atualiza o atributo de instância
                    break;
                case 2:

                    this.comediaEscolhida = filme2;  // Atualiza o atributo de instância
                    break;
                case 3:

                    this.comediaEscolhida = filme3;  // Atualiza o atributo de instância
                    break;
                case 4:

                    this.comediaEscolhida = filme4;  // Atualiza o atributo de instância
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite um valor válido.");
            }

            System.out.println();
        } while (option <0);


        return this.comediaEscolhida;
    }


    public int classificacaoComedia() {
        Scanner scanner = new Scanner(System.in);
        int option1 = 0;

        do {
            System.out.println("Classifique o filme entre 1 a 5 Estrelas:");

            option1 = scanner.nextInt();

            switch (option1) {
                case 1:
                    this.classificacao = 1;
                    break;
                case 2:
                    this.classificacao = 2;
                    break;
                case 3:
                    this.classificacao = 3;
                    break;
                case 4:
                    this.classificacao = 4;
                    break;
                case 5:
                    this.classificacao = 5;
                    break;
                default:
                    System.out.println("Digite um valor válido.");
            }

            System.out.println();
        } while (option1<=0);

    return this.classificacao;
    }


}
