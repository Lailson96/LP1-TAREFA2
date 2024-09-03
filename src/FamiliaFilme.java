import java.util.Scanner;

public class FamiliaFilme {
        private String familiaFilme1;
        private String familiaFilme2;
        private String familiaFilme3;
        private String familiaFilme4;
        public String familiaFilmeEscolhido;
        private int classificacao;


        public FamiliaFilme(String FamiliaFilme1, String FamiliaFilme2, String FamiliaFilme3, String FamiliaFilme4, String filmeEscolhido, String humor) {
            this.familiaFilme1 = FamiliaFilme1;
            this.familiaFilme2 = FamiliaFilme2;
            this.familiaFilme3 = FamiliaFilme3;
            this.familiaFilme4 = FamiliaFilme4;
            this.familiaFilmeEscolhido = "";
            this.classificacao = 0;
        }


        public FamiliaFilme() {
            this.familiaFilme1 = "The Bad Guys";
            this.familiaFilme2 = "Ta Dando Onda";
            this.familiaFilme3 = "Pica-pau";
            this.familiaFilme4 = "Dragão 3 ";
            this.familiaFilmeEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaFamiliaFilme() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um filme Familia :");
                System.out.println("1. " + familiaFilme1);
                System.out.println("2. " + familiaFilme2);
                System.out.println("3. " + familiaFilme3);
                System.out.println("4. " + familiaFilme4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.familiaFilmeEscolhido = familiaFilme1;
                        break;
                    case 2:

                        this.familiaFilmeEscolhido = familiaFilme2;
                        break;
                    case 3:

                        this.familiaFilmeEscolhido = familiaFilme3;
                        break;
                    case 4:

                        this.familiaFilmeEscolhido = familiaFilme4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.familiaFilmeEscolhido;
        }


        public int classificacaoFilmeFamilia() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique "+ familiaFilmeEscolhido +" entre 1 a 5 Estrelas:");

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


