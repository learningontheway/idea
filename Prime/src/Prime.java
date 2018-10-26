import java.util.Scanner;

/*
2、【寻找质数】如果一个整数只能被1和它本身整除，则该数为质数。例如，2、3、5和7都是质数，而4、6、8和9则不是
a）编写一个方法，判断一个数是否为质数
b）在applet中用这个方法找出并打印所有小于10000的质数。在确信找出其中的所有质数之前，需要实际测试多少个数？将结果显示在命令行中
c）最初我们可能会认为，测试每个数是否为质数的测试上限为n/2。但我们只需要测试n的平方根次就可以了，重新编写这个程序，然后运行两个版本的程序。评估第二种程序的性能改进效果
 */

public class Prime {
    public static void main(String [] args)
    {
        System.out.println("请输入一个正整数");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int i;
        int flag1,flag2;                        //flag1,flag2分别用于保存两次的计算数字个数
        for(i=2;i<number/2;i++)                 //利用i进行number的质数判断
        {
            if(number%i==0)break;

        }
        if(i>=number/2) System.out.println("这是一个质数");
        else System.out.println("这不是一个质数");
        System.out.println("输出10000以内的全部质数");
        flag1=prime1();
        flag2=prime2();
        System.out.println("算法效率提高了"+(double)flag1/flag2+"倍");
    }

    //prime1使用n/2去计算质数
    public static int prime1()
    {
        int flag=0;                                     //flag保存测试的数字个数
        for(int j=1;j<10000;j++)                        //j表示对10000以内的数字进行质数计算
        {
            int k;
            for(k=2;k<=j/2;k++)                      //k类似上文中的i
            {
                flag++;
                if(j%k==0)
                {

                    break;
                }
            }
            if(k>j/2) System.out.print(j+"     ");
        }
        System.out.println("总共计算了"+flag+"个数字");
        return flag;
    }


    //prime2()使用根号n去计算质数
    public static int prime2()
    {
        int flag=0;                                     //flag保存测试的数字个数
        for(int j=1;j<10000;j++)                        //j表示对10000以内的数字进行质数计算
        {
            int k;
            for(k=2;k<=Math.sqrt(j);k++)                      //k类似上文中的i
            {
                flag++;
                if(j%k==0)
                {

                    break;
                }
            }
            if(k>Math.sqrt(j)) System.out.print(j+"     ");
        }
        System.out.println("总共计算了"+flag+"个数字");
        return flag;
    }
}
