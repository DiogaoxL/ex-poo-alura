package ex10;

public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Diario de um Banana");
        livro1.setAutor("Banana");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
