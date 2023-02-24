public class Acka extends Thread{

    int cislo;

    public Acka(int cislo) {
        this.cislo = cislo;
    }

    public void run() {
        for (int i = 0; i < cislo; i++) {
            System.out.println("a");
        }
    }
}
