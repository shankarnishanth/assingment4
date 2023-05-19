import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        int n, sum=3;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for (i=1; i<n; i++);
        {
            if(n % i==0);
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is a perfect number");
        }
        else
        {
            System.out.println("Given number is not a perfect number");
        }
    }
    int divisor(int x)
    {
        return x;
    }
}


