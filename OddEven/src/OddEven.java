
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
         num = input.nextInt();

        if (num % 2 == 0){
            if(num>20 && num<30)
            System.out.println("jerry");}

        else {
            if (num > 20 && num < 30)

                System.out.println("tom");
        }


    }
}
