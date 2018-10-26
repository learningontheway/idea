import java.awt.*;
import java.util.Scanner;
import java.math.*;


public class huiwen {
    public static void main(String[] args) {
        int i;
        int[] b=new int[5];
        int[] x=new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个5位的整数");
        int a=input.nextInt();
        if (a/10000==0)
        {
            System.out.println("这不是一个五位整数");
        }
        else
        {
            for(i=4;i>-1;i--)
            {
                b[i]=(int)Math.floor(a/Math.pow(10,i));
                a=a%(int)Math.floor(Math.pow(10,i));
                x[4-i]=b[i];
            }
            for(i=0;i<5;i++)
            {
                if(x[i]==b[i]) continue;
                else break;
            }
            if(i==5)System.out.println("这是一个回文数");
            else System.out.println("这不是一个回文数");
        }


    }
}
