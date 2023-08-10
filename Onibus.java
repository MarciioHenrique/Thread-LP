import java.util.ArrayList;

public class Onibus{
    private int[] lugares;

    public Onibus(int[] lugares) {
        this.lugares = lugares;
    }

    public void Comprar(int posicao, String nome) {
      if (lugares[posicao] == 0) {
            lugares[posicao] = 1;
            System.out.println(nome +" agora ocupa o lugar "+ posicao);
        }
        else {
            System.out.println(nome+ "Lugar ocupado");
        }
    }
}