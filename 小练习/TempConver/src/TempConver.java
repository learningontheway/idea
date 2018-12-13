import java.util.Scanner;

/*
温度转换】实现华氏度与摄氏度互相转换的方法：
a)方法celsius用公式C=5.0/9.0*(F-32)，返回一个与华氏温度值对等的摄氏温度值。
b)方法fahrenheit使用公式F=9.0/5.0*C+32，返回与摄氏温度值对等的华氏温度值。
用a)和b)开发的方法编写一个程序，该程序可使用户输入的摄氏温度值或华氏温度值互相转换。
 */
public class TempConver {
    public static void main(String[] args)
    {
        System.out.println("请输入当前温度与温度表示法，用空格隔开（F表示华氏度，C表示摄氏度）");
        Scanner input=new Scanner(System.in);
        Double temperature=input.nextDouble();          //temoerature存放温度数值
        String letter=input.next();                     //letter存放温度表示法
        if(letter.equals("F"))
        {
            temperature=5.0*(temperature-32)/9.0;
            System.out.println("输入的华氏度转换为摄氏度为"+temperature+"度");
        }
        else
            if(letter.equals("C"))
            {
                temperature=9.0*temperature/5.0+32;
                System.out.println("输入的摄氏度转换为华氏度为"+temperature+"度");
            }
            else System.out.println("温度表示法输入错误");
    }
}
