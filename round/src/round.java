import java.math.*;

/*
【四舍五入计算】Math.floor可用于将一个数舍入到指定的十进制数位。
语句：y = Math.floor(x * 10 + 0.5)/10将x舍入到十分位（即，小数点右边第一位），而语句：y = Math.floor(x * 100 + 0.5)/100将x舍入到百分位（即小数点右边第二位）。
编写一个程序，定义将x按不同方式舍入的4个方法：
roundToInteger(number)
roundToTenths(number)
roundToHunredths(number)
roundToThousanths(number)
对于每个读入的值，程序应该显示其原来的值、舍入到最接近整数的值、最接近十分位的值、最接近百分位的值，最接近千分位的值。
 */


import java.util.Scanner;

public class round {
    public static void main(String[] args)
    {
        System.out.println("请输入一个小数");
        Scanner input=new Scanner(System.in);
        double number =input.nextDouble();                      //number存入初试的输入小数
        System.out.println("初始的输入小数为"+number);
        roundToInteger(number);
        roundToTenths(number);
        roundToHunredths(number);
        roundToThousanths(number);
    }
    public static void roundToInteger(double number)
    {

       System.out.println("舍入到最接近整数的值为"+Math.round(number));


    }
    public static void  roundToTenths(double number)
    {
        double num1=Math.round(number*10);
        System.out.println("最接近十分位的值为"+num1/10);
        //直接System.out.println("舍入到最接近十分位的值为"+Math.floor(number*10+0.5)/10)也可以正确输出，
        //但是 System.out.println("舍入到最接近十分位的值为"+Math.round(number*10+0.5)/10)却只输出整数部分
        // floor，ceil输出的是一个浮点型数据，round输出的是一个整形数据

    }
    public static void  roundToHunredths(double number) {
        double num1=Math.round(number*100);
        System.out.println("最接近百分位的值为"+num1/100);
    }
    public  static void  roundToThousanths(double number)
    {
        double num1=Math.round(number*1000);
        System.out.println("最接近千分位的值为"+num1/1000);
    }

}
