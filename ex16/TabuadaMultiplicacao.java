package ex16;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int n){
        int i ;
        for(i = 1; i <= 10; i++){
            System.out.println(n + "X" + i + " = " + (n * i));
        }
    }
}
