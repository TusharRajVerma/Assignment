public class Ans8 {

    private static int someVariable;

    public static synchronized void doSomething() throws InterruptedException {
        someVariable++;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
		    System.out.println("thread1 starts");
		    Thread.sleep(1000);
		    System.out.println("thread1 resume after 1 sec");
                    Ans8.doSomething();
                } catch (InterruptedException e) {
	
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
		    Thread.sleep(1000);
                    Ans8.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(someVariable);
    }
}

