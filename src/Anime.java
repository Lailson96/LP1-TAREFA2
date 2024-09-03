import java.util.Scanner;

public class Anime {
    private String anime1;
    private String anime2;
    private String anime3;
    private String anime4;
    public String animeEscolhido;
    private int classificacao;


    public Anime(String anime1, String anime2, String anime3, String anime4, String filmeEscolhido, String humor) {
        this.anime1 = anime1;
        this.anime2 = anime2;
        this.anime3 = anime3;
        this.anime4 = anime4;
        this.animeEscolhido = "";
        this.classificacao = 0;
    }


    public Anime() {
        this.anime1 = "One Piece";
        this.anime2 = "Demon Slayer";
        this.anime3 = "Spy x Family";
        this.anime4 = "One Punch Man";
        this.animeEscolhido = "";
        this.classificacao=0;

    }
    public int  getclassificacao(){
        return classificacao;
    }

    public String selecionaAnime() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Selecione um filme Anime :");
            System.out.println("1. " + anime1);
            System.out.println("2. " + anime2);
            System.out.println("3. " + anime3);
            System.out.println("4. " + anime4);
            System.out.println("5. Sair");


            option = scanner.nextInt();

            switch (option) {
                case 1:

                    this.animeEscolhido = anime1;
                    break;
                case 2:

                    this.animeEscolhido = anime2;
                    break;
                case 3:

                    this.animeEscolhido = anime3;
                    break;
                case 4:

                    this.animeEscolhido = anime4;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite um valor válido  .");
            }

            System.out.println();
        } while (option <0);


        return this.animeEscolhido;
    }


    public int classificacaoAnime() {
        Scanner scanner = new Scanner(System.in);
        int option1 = 0;

        do {
            System.out.println("Classifique"+ animeEscolhido +"entre 1 a 5 Estrelas:");

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
