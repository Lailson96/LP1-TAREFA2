import java.util.Scanner;

    public class Fantasia {
        private String fantasia1;
        private String fantasia2;
        private String fantasia3;
        private String fantasia4;
        public String fantasiaEscolhido;
        private int classificacao;


        public Fantasia(String fantasia1, String fantasia2, String fantasia3, String fatasia4, String filmeEscolhido, String humor) {
            this.fantasia1 = fantasia1;
            this.fantasia2 = fantasia2;
            this.fantasia3 = fantasia3;
            this.fantasia4 = fatasia4;
            this.fantasiaEscolhido = "";
            this.classificacao = 0;
        }


        public Fantasia() {
            this.fantasia1 = "A Múmia";
            this.fantasia2 = "exterminador do futuro 2";
            this.fantasia3 = "Maze Runner";
            this.fantasia4 = "Donzela";
            this.fantasiaEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaFantasia() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um filme de Fantasia :");
                System.out.println("1. " + fantasia1);
                System.out.println("2. " + fantasia2);
                System.out.println("3. " + fantasia3);
                System.out.println("4. " + fantasia4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.fantasiaEscolhido = fantasia1;
                        break;
                    case 2:

                        this.fantasiaEscolhido = fantasia2;
                        break;
                    case 3:

                        this.fantasiaEscolhido = fantasia3;
                        break;
                    case 4:

                        this.fantasiaEscolhido = fantasia4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.fantasiaEscolhido;
        }


        public int classificacaoFantasia() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique"+ fantasiaEscolhido +"entre 1 a 5 Estrelas:");

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

