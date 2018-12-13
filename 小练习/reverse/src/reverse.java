import java.util.Scanner;

/*
【数字倒序输出】编写一个方法，它只带一个整数参数，并按位逆序返回这个整数值。
例如，给定整数7631，则方法应返回1367。程序需要从用户那里读入一个值，将方法的结果显示在命令行中。
 */

public class reverse {
    public static  void main(String[] args)
    {
        System.out.print("请输入一个整数");
        Scanner input= new Scanner(System.in);
        String num=input.nextLine();                                        //注意这里的num的类型

        System.out.println("输入整数逆序后的值为"+new StringBuffer(num).reverse().toString());
    }
}
