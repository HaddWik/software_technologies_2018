import java.util.Scanner;

public class MaxNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = -Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());

            if(num > max)
                max = num;
        }

        System.out.println(max);
    }
}
