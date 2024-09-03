import java.util.Scanner;

    public class Documentarios {
        private String documentario1;
        private String documentario2;
        private String documentario3;
        private String documentario4;
        public String documentarioEscolhido;
        private int classificacao;


        public Documentarios(String documentario1, String documentario2, String documentario3, String documentario4, String filmeEscolhido, String humor) {
            this.documentario1 = documentario1;
            this.documentario2 = documentario2;
            this.documentario3 = documentario3;
            this.documentario4 = documentario4;
            this.documentarioEscolhido = "";
            this.classificacao = 0;
        }


        public Documentarios() {
            this.documentario1 = "Arremesso Final";
            this.documentario2 = "Sprint";
            this.documentario3 = "Beckhan";
            this.documentario4 = "Historia de Moisés";
            this.documentarioEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaDocumentario() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um Documentario :");
                System.out.println("1. " + documentario1);
                System.out.println("2. " + documentario2);
                System.out.println("3. " + documentario3);
                System.out.println("4. " + documentario4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.documentarioEscolhido = documentario1;
                        break;
                    case 2:

                        this.documentarioEscolhido = documentario2;
                        break;
                    case 3:

                        this.documentarioEscolhido = documentario3;
                        break;
                    case 4:

                        this.documentarioEscolhido = documentario4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.documentarioEscolhido;
        }


        public int classificacaoDocumentario() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique "+ documentarioEscolhido +" entre 1 a 5 Estrelas:");

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



