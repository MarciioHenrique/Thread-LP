public class Cliente extends Thread{
    private int posicao;
    private Onibus onibus;

    public Cliente(int posicao, Onibus onibus) {
        this.posicao = posicao;
        this.onibus = onibus;
    }

    public void run() {
        onibus.Comprar(posicao, this.getName());
    }
    
}
