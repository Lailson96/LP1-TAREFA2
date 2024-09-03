import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        ComediaFilme comediaFilme=new ComediaFilme();
        Anime anime=new Anime();
        FamiliaFilme familiaFilme=new FamiliaFilme();
        Series series=new Series();
        Documentarios documentarios=new Documentarios();
        Fantasia fantasia=new Fantasia();
        Acao acao=new Acao();
        Romantico romantico= new Romantico();
        Terror terror=new Terror();
        Scanner scanner = new Scanner(System.in);

        usuario.selecionaUsuario();
        System.out.println("Digite sua idade: ");
        usuario.verificaIdade();
            int option = 0;

            do {
                System.out.println(usuario.usuarioEscolhido+" Escolha um Gênero de filme: ");
                System.out.println("1. Comedia");
                System.out.println("2. Anime");
                System.out.println("3. Familia");
                System.out.println("4. Series");
                System.out.println("5. Documentarios");
                System.out.println("6. Fantasia");
                System.out.println("7. Ação");
                System.out.println("8. Romântico");
                System.out.println("9. Terror");
                System.out.println("10. Sair");

                // Lendo a opção do usuário
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        comediaFilme.selecionaComedia();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + comediaFilme.comediaEscolhida+"\n");

                        System.out.println("classificou, "+comediaFilme.comediaEscolhida + " com " + comediaFilme.classificacaoComedia() +" estrelas");
                        break;
                    case 2:
                        anime.selecionaAnime();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + anime.animeEscolhido+"\n");
                        anime.classificacaoAnime();
                        System.out.println("classificou, "+anime.animeEscolhido + " com " + anime.getclassificacao() +" estrelas");
                        break;
                    case 3:
                        familiaFilme.selecionaFamiliaFilme();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + familiaFilme.familiaFilmeEscolhido+"\n");
                        familiaFilme.classificacaoFilmeFamilia();
                        System.out.println("classificou, "+familiaFilme.familiaFilmeEscolhido + " com " + familiaFilme.getclassificacao() +" estrelas");
                        break;
                    case 4:
                        series.selecionaSerie();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + series.serieEscolhida+"\n");
                        series.classificacaoSerie();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + series.getclassificacao() +" estrelas");
                        break;
                    case 5:
                        documentarios.selecionaDocumentario();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + documentarios.documentarioEscolhido+"\n");
                        documentarios.classificacaoDocumentario();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + documentarios.getclassificacao() +" estrelas");
                        break;
                    case 6:
                        fantasia.selecionaFantasia();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + fantasia.fantasiaEscolhido+"\n");
                       fantasia.classificacaoFantasia();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + fantasia.getclassificacao() +" estrelas");
                        break;
                    case 7:
                        acao.selecionaAcao();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + acao.acaoEscolhido+"\n");
                        acao.classificacaoAcao();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + acao.getclassificacao() +" estrelas");
                        break;
                    case 8:
                        romantico.selecionaRomantico();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + romantico.romanticoEscolhido+"\n");
                        romantico.classificacaoRomantico();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + romantico.getclassificacao() +" estrelas");
                        break;
                    case 9:
                        terror.selecionaTerror();

                        System.out.println("\n"+ usuario.usuarioEscolhido +" Você escolheu: " + terror.terrorEscolhido+"\n");
                        terror.classificacaoTerror();
                        System.out.println("classificou, "+series.serieEscolhida + " com " + terror.getclassificacao() +" estrelas");
                        break;

                    default:
                        System.out.println("Digite um valor válido.");
                }

                System.out.println();
            } while (option!=5);

            scanner.close();

        }
    }


