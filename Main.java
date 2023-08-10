public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] lugares = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Onibus onibus = new Onibus(lugares);
        Cliente c1 = new Cliente(1, onibus);
        Cliente c2 = new Cliente(1, onibus);
        Cliente c3 = new Cliente(1, onibus);
        Cliente c4 = new Cliente(1, onibus);
        Cliente c5 = new Cliente(1, onibus);
        Cliente c6 = new Cliente(1, onibus);
        Cliente c7 = new Cliente(1, onibus);
        Cliente c8 = new Cliente(1, onibus);
        Cliente c9 = new Cliente(1, onibus);
        Cliente c10 = new Cliente(1, onibus);
        Cliente c11 = new Cliente(1, onibus);
        Cliente c12 = new Cliente(1, onibus);
        Cliente c13 = new Cliente(1, onibus);
        Cliente c14 = new Cliente(1, onibus);
      
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        c12.start();
        c13.start();
        c14.start();
      
        System.out.println("Main terminou");
        }
}