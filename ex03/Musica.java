package ex03;

public class Musica {
    String titulo;
    String nomeArtista;
    int anoLancamento;
    double SomaAvaliacao;
    int numAvaliacao;

    void mostraFichaTecnica(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Nome do artista: " + nomeArtista);
        System.out.println("Ano: " + anoLancamento);

    }

    void avalie(int nota){
         SomaAvaliacao += nota;
         numAvaliacao++;
    }

    double mediaAvaliacoes(){
        return SomaAvaliacao / numAvaliacao ;
    }


}
