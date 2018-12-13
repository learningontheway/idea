import java.math.*;
/*
【计算圆周率】用无穷序列计算π的值：π = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + ...。（1）
打印一张分别由上面序列中的1项、2项、3项等近似计算出的π值表；
（2）在第一次得到3.14,3.141,3.1415,3.14159这些值之前分别用了几项。
*/
public class yuanzhoulv {
    public static void main(String[] args)
    {
       int i;                  //i控制循环
        double sum;                //sum定义的是每次迭代后的Π的值
        double remain;              //保存sum的前k位
        int flag1=0,flag2=0,flag3=0,flag4=0;        //用于保存得到相应的Π值时的当前i的值
        sum=4;
        for(i=1;;i++)
        {
            sum=sum+Math.pow(-1,i)*4/(2*i+1);   //sum的迭代计算公式
            System.out.println(sum);
            for(int j=0;j<4;j++)                                    //循环内判定第一次出现前k位相关值的次数，并保留相关的i
            {
                remain=remain_i(sum,j+2);
                if(remain==3.14&&flag1==0)   flag1=i;
                  if(remain==3.141&&flag2==0)   flag2=i;          //判定flag是否等于0来确定flag是否已经被修改，若以修改，则不能进一步赋值,即每条语句只执行一次
                  if(remain==3.1415&&flag3==0)   flag3=i;
                  if(remain==3.14159&&flag4==0)   flag4=i;
            }
            if(flag4!=0)break;                                   //当所有值都已经出现过后，跳出循环

        }
        System.out.println("得到3.14需要"+flag1+"次循环");
        System.out.println("得到3.141需要"+flag2+"次循环");
        System.out.println("得到3.1415需要"+flag3+"次循环");
        System.out.println("得到3.14159需要"+flag4+"次循环");
    }
    public static double remain_i(double sum,int i)                                 //保留sum的前i位小数
    {
        BigDecimal b = new BigDecimal(sum);
        double f1 = b.setScale(i, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }
}
