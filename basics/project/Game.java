import java.util.*;
// MATH GAME using Random class

class Game {

    static int score = 0;

    static void add()
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 0;

        size = Math.abs(r.nextInt() % 3) + 2;

        for (int i = 0; i < size; ++i) {
            rand = Math.abs(r.nextInt() % 15);

            if (i < size - 1) {
                System.out.print(rand + " + ");
            } else {
                System.out.print(rand + " = ");
            }

            sum = sum + rand;
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 5;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 5;
            System.out.println("Ooops, incorrect answer, Correct ans is: " + sum + " Score is " + score);
        }
    }

    static void sub()
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 0;

        size = Math.abs(r.nextInt() % 3) + 2;

        for (int i = 0; i < size; ++i) {
            rand = Math.abs(r.nextInt() % 16);
            if (i < size - 1) {
                System.out.print(rand + " - ");
            } else {
                System.out.print(rand + " = ");
            }

            if (i == 0) {
                sum = rand;
            } else {
                sum = sum - rand;
            }
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 5;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 5;
            System.out.println("Ooops, incorrect answer, Correct ans is: " + sum + " Score is " + score);
        }
    }

    static void div()
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand;

        float arr[] = new float[2];
        arr[0] = (Math.abs(r.nextInt() % 20 + 1));
        arr[1] = (Math.abs(r.nextInt() % 5) + 1);
        double sum = arr[0] / arr[1];
        System.out.print(arr[0] + " / " + arr[1] + " = ");
        double ans = s.nextFloat();

        if (ans == sum) {
            score = score + 15;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Ooops, incorrect answer, Correct ans is: " + sum + " Score is " + score);
        }
    }

    static void mult()
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand, size, sum = 1;

        size = Math.abs(r.nextInt() % 2) + 2;

        for (int i = 0; i < size; ++i) {
            rand = Math.abs(r.nextInt() % 10 + 1);
            if (i < size - 1) {
                System.out.print(rand + " * ");
            } else {
                System.out.print(rand + " = ");
            }
            sum = sum * rand;
        }

        int ans = s.nextInt();

        if (ans == sum) {
            score = score + 10;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Ooops, incorrect answer, Correct ans is: " + sum + " Score is " + score);
        }
    }

    static void fact()
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int rand = Math.abs(r.nextInt() % 12 + 1);
        long fact = 1;
        for (int i = 1; i <= rand; ++i) {
            fact = fact * i;
        }
        System.out.print(rand + "! = ");
        long ans = s.nextInt();
        if (ans == fact) {
            score = score + 10;
            System.out.println("Correct answer. Your score is " + score);
        } else {
            score = score - 10;
            System.out.println("Ooops, incorrect answer, Correct ans is: " + fact + " Score is " + score);
        }
    }

    public static void main(String[] args)
    {
        Random r = new Random();
        System.out.print("lets start the game....................... ");
        System.out.println("Target score = 100");
        while (true) {
            int game = Math.abs(r.nextInt() % 5);

            switch (game) {
            case 0:
                add();
                break;
            case 1:
                sub();
                break;
            case 2:
                mult();
                break;
            case 3:
                div();
                break;
            case 4:
                fact();
                break;
            }

            if (score >= 100) {
                break;
            }
        }

        System.out.println("Your Final Score is: " + score);
    }
}
