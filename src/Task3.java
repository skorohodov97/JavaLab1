import java.util.Scanner;

public class Task3 {
    public void Invoke()
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
}
