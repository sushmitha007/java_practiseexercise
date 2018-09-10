import java.util.Scanner;
public class Addition {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the input");
        int num=input.nextInt();
        while (num!=0)
        {
            sum += num;
            num=input.nextInt();
        }
        System.out.println("output:"+sum);
    }
}
