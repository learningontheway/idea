import java.awt.*;
import java.util.Scanner;

public class driver {
  public  static  void  main(String[] args)
  {

      Scanner input=new Scanner(System.in);
      double km[]=new double[5];
      double kg[]=new double[5];
    for(int i=0;i<5;i++)
    {
        System.out.println("请输入第"+i+"次汽油的加仑数和里程数");
        kg[i]=input.nextDouble();
        km[i]=input.nextDouble();
        System.out.println("本次的每加仑油的里程数是");
        System.out.println(km[i]/kg[i]);

    }
      System.out.println("输入完成");
    }
}
