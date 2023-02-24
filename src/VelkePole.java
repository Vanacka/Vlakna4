public class VelkePole extends Thread {
    int [] arr;

    public VelkePole() {
        arr = new int[1000000];
    }

    public int delkaPole () {
        return arr.length;
    }

    public synchronized void prictiJedna(int index) {
        arr[index]++;
    }

    public int secti() {
        int soucet = 0;
        for (int i : arr) {
            soucet += i;
        }
        return soucet;
    }
}
