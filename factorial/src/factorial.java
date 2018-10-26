
/*
2、【计算阶乘】编写应用程序，计算从1到20之间各个整数的阶乘，结果输出在控制台中。
 */

public class factorial {
    public static void main(String[] args) {
      long sum;         //阶乘完后的累加和
      int i;
        sum=0;
        for(i=1;i<21;i++)                           //其实还有更简单的方法，直接用n=1,n=n*i，sum=sum+n就可以实现功能
            sum += factorial(i);
        System.out.println(sum);
    }
    public static long  factorial(int num)           //定义了阶乘的计算方法
    {
        int k;
        long sum1=1;
        for(k=1;k<num+1;k++)
        {
            sum1=sum1*k;
        }
        return sum1;
    }

}
