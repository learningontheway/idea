import java.util.Scanner;
import java.math.*;
//二进制转十进制数
public class Binarytodecimal {
    public static void  main(String[] args)
    {
        System.out.println("请输入一个二进制数,回车表示输入完毕");
        Scanner input=new Scanner(System.in);
        int binary=input.nextInt();
        Integer binary2=binary;
        int a;
        int n=binary2.toString().length();
        System.out.println(n);
        double sum=0;
        for(int i=0;i<n;i++)
        {
            a=(int)Math.floor(binary/Math.pow(10,n-1-i));
            binary=(int)Math.floor(binary%Math.pow(10,n-1-i));
            sum=sum+a*Math.pow(2,n-1-i);

        }
    System.out.println("转换成十进制数："+sum);

    }
}
