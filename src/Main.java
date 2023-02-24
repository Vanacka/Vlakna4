public class Main {
    public static void main(String[] args) throws InterruptedException {
        VelkePole p = new VelkePole();

        System.out.println(p.secti());

        VlaknoA a = new VlaknoA(p);
        VlaknoA b = new VlaknoA(p);
        a.start();
        //Thread.sleep(4);
        b.start();

        System.out.println("Leck mich am Arsch!");

        //join() pocka na to az vlakno skonci
        a.join();
        b.join();

        System.out.println(p.secti());
    }
}