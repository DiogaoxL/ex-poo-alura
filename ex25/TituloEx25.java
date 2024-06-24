package ex25;

public class TituloEx25 implements Comparable<TituloEx25> {
    private String nome;

    public TituloEx25(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(TituloEx25 outroTitulo){
        return this.nome.compareTo(outroTitulo.getNome());
    }

    public String toString(){
        return "titulo" + this.getNome();
    }
}
