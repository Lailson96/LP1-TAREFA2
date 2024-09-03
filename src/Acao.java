import java.util.Scanner;

    public class Acao {
        private String acao1;
        private String acao2;
        private String acao3;
        private String acao4;
        public String acaoEscolhido;
        private int classificacao;


        public Acao(String acao1, String acao2, String acao3, String acao4, String filmeEscolhido, String humor) {
            this.acao1 = acao1;
            this.acao2 = acao2;
            this.acao3 = acao3;
            this.acao4 = acao4;
            this.acaoEscolhido = "";
            this.classificacao = 0;
        }


        public Acao() {
            this.acao1 = "O Protetor";
            this.acao2 = "Missão impossivel";
            this.acao3 = "de Volta ao Jogo";
            this.acao4 = "Ambuância";
            this.acaoEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaAcao() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um filme de Ação :");
                System.out.println("1. " + acao1);
                System.out.println("2. " + acao2);
                System.out.println("3. " + acao3);
                System.out.println("4. " + acao4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.acaoEscolhido = acao1;
                        break;
                    case 2:

                        this.acaoEscolhido = acao2;
                        break;
                    case 3:

                        this.acaoEscolhido = acao3;
                        break;
                    case 4:

                        this.acaoEscolhido = acao4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.acaoEscolhido;
        }


        public int classificacaoAcao() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique"+ acaoEscolhido +"entre 1 a 5 Estrelas:");

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

