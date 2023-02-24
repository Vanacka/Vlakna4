public class Cisla extends Thread {

    int maxCislo;

    public Cisla(int maxCislo) {
        this.maxCislo = maxCislo;
    }

    public void run() {
        for (int i = 0; i <= maxCislo; i++) {
            System.out.println(i);
        }
    }
}
