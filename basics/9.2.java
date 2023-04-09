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

        printA a1 = new printA();
        printB b1 = new printB();
        print100 i1 = new print100();

        Thread a = new Thread(a1);
        Thread b = new Thread(b1);
        Thread i = new Thread(i1);
        
        //Thread a = new Thread(new printA());
        //Thread b = new Thread(new printb());
        //Thread i = new Thread(new print100()); is also valid code replacing the above two paragraphs

        a.start();
        b.start();
        i.start();
    }
}
