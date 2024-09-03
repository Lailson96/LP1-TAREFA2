import java.util.Scanner;

    public class Romantico {
        private String romantico1;
        private String romantico2;
        private String romantoco3;
        private String romantico4;
        public String romanticoEscolhido;
        private int classificacao;


        public Romantico(String romantico1, String romantico2, String romantico3, String romantico4, String filmeEscolhido, String humor) {
            this.romantico1 = romantico1;
            this.romantico2 = romantico2;
            this.romantoco3 = romantico3;
            this.romantico4 = romantico4;
            this.romanticoEscolhido = "";
            this.classificacao = 0;
        }


        public Romantico() {
            this.romantico1 = "Como Perder Um Homem em 10 Dias";
            this.romantico2 = "Esposa de Mentirinha";
            this.romantoco3 = "Case Comigo";
            this.romantico4 = "Amarrações do Amor";
            this.romanticoEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaRomantico() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um filme Romântico :");
                System.out.println("1. " + romantico1);
                System.out.println("2. " + romantico2);
                System.out.println("3. " + romantoco3);
                System.out.println("4. " + romantico4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.romanticoEscolhido = romantico1;
                        break;
                    case 2:

                        this.romanticoEscolhido = romantico2;
                        break;
                    case 3:

                        this.romanticoEscolhido = romantoco3;
                        break;
                    case 4:

                        this.romanticoEscolhido = romantico4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.romanticoEscolhido;
        }


        public int classificacaoRomantico() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique"+ romanticoEscolhido +"entre 1 a 5 Estrelas :");

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


