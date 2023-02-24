public class VlaknoA extends Thread {
    VelkePole arr;

    public VlaknoA(VelkePole arr) {
        this.arr = arr;
    }
    public void run() {
        for (int i = 0; i < arr.delkaPole(); i++) {
            arr.prictiJedna(i);
        }
    }
}
