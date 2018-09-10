import java.util.Scanner;
public class Palindrome {

    public static void main(String args[]) {

        int n, m, a = 0, x,sum=0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter any number:");

        n = s.nextInt();

        m = n;

        while (n > 0) {

            x = n % 10;
            if(x%2==0)
            {
                sum=sum+x;
            }

            a = a * 10 + x;

            n = n / 10;

        }

        if (a == m) {

            System.out.println("Given number " + m + " is Palindrome");

        } else {

            System.out.println("Given number " + m + " is Not Palindrome");

        }
        if(sum>25){
            System.out.println("sum of even number is greater than 25");
        }
        else{
            System.out.println("sum of even is less than 25");
        }

    }

}
