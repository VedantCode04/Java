class printA implements Runnable {
    public void run()
    {
        for (int i = 0; i < 100; ++i) {
            System.out.print("a ");
        }
    }
}

class printB implements Runnable {
    public void run()
    {
        for (int i = 0; i < 100; ++i) {
            System.out.print("b ");
        }
    }
}

class print100 implements Runnable {
    public void run()
    {
        for (int i = 1; i <= 100; ++i) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

class Main {
    public static void main(String[] args)
    {
        System.out.println("\nVEDANT PATEL IU2141230208\n");

        Thread a = new Thread(new printA());
        Thread b = new Thread(new printB());
        Thread i = new Thread(new print100());

        a.start();
        b.start();
        i.start();
    }
}
