package ex03;

public class Principalmusica {
    public static void main(String [] args ){

        Musica m1 = new Musica();

        m1.titulo = "400k";
        m1.nomeArtista = "Mc IG";
        m1.anoLancamento = 2023;

        m1.mostraFichaTecnica();
        m1.avalie(10);
        m1.avalie(9);
        m1.avalie(1);

        System.out.printf("Avaliação: %.2f" , m1.mediaAvaliacoes());

    }

}
