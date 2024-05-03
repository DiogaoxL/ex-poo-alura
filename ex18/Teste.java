package ex18;

public class Teste {
    public static void main(String[] args) {
        Livro livro = new Livro();

        System.out.println("O valor final é: " + livro.calcularPrecoFinal(10,10));

        ProdutoFisico produtoFisico = new ProdutoFisico();

        System.out.println("O valor final é: " + livro.calcularPrecoFinal(20,20));
    }
}
