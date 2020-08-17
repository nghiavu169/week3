public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NumberGenerator n1 = new NumberGenerator();
        Thread t1 = new Thread(n1);
        NumberGenerator n2 = new NumberGenerator();
        Thread t2 = new Thread(n2);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t1.join();
        t2.start();

    }
}

