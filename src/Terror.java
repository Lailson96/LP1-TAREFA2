import java.util.Scanner;

    public class Terror {
        private String terror1;
        private String terro2;
        private String terror3;
        private String terror4;
        public String terrorEscolhido;
        private int classificacao;


        public Terror(String terrro1, String terro2, String terror3, String terror2, String filmeEscolhido, String humor) {
            this.terror1 = terrro1;
            this.terro2 = terro2;
            this.terror3 = terror3;
            this.terror4 = terror2;
            this.terrorEscolhido = "";
            this.classificacao = 0;
        }


        public Terror() {
            this.terror1 = "Sorria";
            this.terro2 = "a Maldição Winchester";
            this.terror3 = "Fragmentado";
            this.terror4 = "MAMA";
            this.terrorEscolhido = "";
            this.classificacao=0;

        }
        public int  getclassificacao(){
            return classificacao;
        }

        public String selecionaTerror() {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            do {
                System.out.println("Selecione um Filme de Terror :");
                System.out.println("1. " + terror1);
                System.out.println("2. " + terro2);
                System.out.println("3. " + terror3);
                System.out.println("4. " + terror4);
                System.out.println("5. Sair");


                option = scanner.nextInt();

                switch (option) {
                    case 1:

                        this.terrorEscolhido = terror1;
                        break;
                    case 2:

                        this.terrorEscolhido = terro2;
                        break;
                    case 3:

                        this.terrorEscolhido = terror3;
                        break;
                    case 4:

                        this.terrorEscolhido = terror4;
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Digite um valor válido  .");
                }

                System.out.println();
            } while (option <0);


            return this.terrorEscolhido;
        }


        public int classificacaoTerror() {
            Scanner scanner = new Scanner(System.in);
            int option1 = 0;

            do {
                System.out.println("Classifique "+ terrorEscolhido +" entre 1 a 5 Estrelas:");

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




