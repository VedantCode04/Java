class printA extends Thread {
    public void run()
    {
        for (int i = 0; i < 100; ++i) {
            System.out.print("a ");
        }
    }
}
class printB extends Thread {
    public void run()
    {
        for (int i = 0; i < 100; ++i) {
            System.out.print("b ");
        }
    }
}
class print100 extends Thread {
    public void run()
    {
        for (int i = 1; i <= 100; ++i) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

class main {
    public static void main(String[] args)
    {
        System.out.println("\nVEDANT PATEL IU2141230208\n");
        printA a = new printA();
        printB b = new printB();
        print100 i = new print100();

        a.start();
        b.start();
        i.start();
    }
}
