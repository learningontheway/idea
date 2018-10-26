/*
计算两点间距离】编写方法disance，计算(x1, y1)和(x2, y2)两点之间的距离。所有的数字和返回值均为double类型。该方法使用户输入点的坐标，输出坐标点距离。
 */

import java.util.Scanner;

public class distance {
    public static void main(String [] args){
        System.out.println("请输入两个坐标（x1,y1)(x2,y2）（利用空格隔开）");
        Scanner input=new Scanner(System.in);

        //利用x1,y1,x2,y2进行输入数据的保存

        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();

       double sum=distance(x1,y1,x2,y2);                                        //sum 为坐标点间的距离

        System.out.println("两个坐标点的距离为"+sum);

    }
    public static double distance(double x1,double y1,double x2,double y2){
        double sum=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        return Math.sqrt(sum);
    }
}
