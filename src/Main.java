import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        task10.Invoke();
    }

    static void exesice1(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(n, 8));
        System.out.println(Integer.toString(n, 16));
    }

    static void exesice2(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n%360+360)%360);
        System.out.println(Math.floorMod(n, 360));
    }

    static void exesice3(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int max, a;

        max = in.nextInt();
        for (int i = 0; i < 2; ++i)
        {
            a = in.nextInt();
            if (a > max)
                max = a;
            // тоже самое с медотом Math.max()
            // max = Math.max(max, a);
        }

        System.out.println(max);
    }

    static void exesice4(String[] args)
    {
        System.out.println(Math.nextUp(0.0));
        System.out.println(Math.nextUp(Double.MAX_VALUE));
    }

    static void exesice5(String[] args)
    {
        // ответ, целочисленная переменная примет максимально возможное допустимое значение типа int
        double a = 2.14748376E9;
        int b = (int)a;
        System.out.println(b);
    }

    static void exesice6(String[] args)
    {
        int n = 1000;
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        System.out.println(result);
    }

    static void exesice7()
    {
        short a, b;
        Scanner in = new Scanner(System.in);

        a = in.nextShort();
        b = in.nextShort();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    static void exesice8()
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] array_str = str.split(" ");
        System.out.println(array_str);

    }


}