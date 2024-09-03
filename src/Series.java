    import java.util.Scanner;
    public class Series {
        private String serie1;
        private String serie2;
        private String seire3;
        private String serie4;
        public String serieEscolhida;
        private int classificacao;


        public Series(String serie1, String serie2, String serie3, String serie4, String filmeEscolhido, String humor) {
            this.serie1 = serie1;
            this.serie2 = serie2;
            this.seire3 = serie3;
            this.serie4 = serie4;
            this.serieEscolhida = "";
            this.classificacao = 0;
        }


        public Series() {
            this.serie1 = "Breaking bad";
            this.serie2 = "Dexter";
            this.seire3 = "Sintonia";
            this.serie4 = "Narcos";
            this.serieEscolhida = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaSerie() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione uma Serie :");
                System.out.println("1. " + serie1);
                System.out.println("2. " + serie2);
                System.out.println("3. " + seire3);
                System.out.println("4. " + serie4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.serieEscolhida = serie1;
                        break;
                    case 2:

                        this.serieEscolhida = serie2;
                        break;
                    case 3:

                        this.serieEscolhida = seire3;
                        break;
                    case 4:

                        this.serieEscolhida = serie4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.serieEscolhida;
        }


        public int classificacaoSerie() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique "+ serieEscolhida +" entre 1 a 5 Estrelas:");

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



