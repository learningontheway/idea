import java.util.Scanner;

public class iftriangle {
    public static void main(String[] args)
    {
        System.out.println("请输入三个整数作为三角形的三条边");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a+b>c&&a-b<c)
        {
            System.out.println("这是一个三角形");
            if(a==b||a==c||b==c)
            {
                if(a==b&&b==c)System.out.println("并且是一个等边三角形");
                else System.out.println("并且是一个等腰三角形");

            }
            if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)System.out.println("并且是一个直角三角形");
        }
       else System.out.println("这不是一个三角形");

    }
}
