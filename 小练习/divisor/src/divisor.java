


/*
2、【普通方法求最大公约数】2个整数的最大公约数（greastest common divisor，GCD）是能同时被这2个数整除的最大整数
。编写方法gcd，返回两个整数的最大公约数。该方法从用户那里读入2个值，在命令行上显示方法的结果
2、【递归求最大公约数】整数x和y的最大公约数就是能同时被x和y整除的最大整数。编写递归方法gcd，返回x和y的最大公约数。
x和y的最大公约数方法gcd的递归定义如下：如果y等于0，则gcd(x, y)就是；否则，gcd(x, y)就等于gcd(y, x%y)，其中“%”是求模运算符。
 */


import java.util.Scanner;


public class divisor {
    public static void main(String[] args) {

        System.out.println("请输入两个整数");


        //num1,num2保存输入数据
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        //divisor1,divisor2保存返回数据
        int divisor1 = gcdmethod1(num1, num2);
        System.out.println("普通方法求得最大公约数是" + divisor1);

        int divisor2 = gcdmethod2(num1, num2);
        System.out.println("递归方法求得的最大公约数是" + divisor2);
    }

    //使用普通方法计算最大公约数
    public static int gcdmethod1(int num1, int num2) {

        //i从输入的较小值开始回退，知道满足最大公约数的条件
        int i;
        for (i = Math.min(num1, num2); i > 1; i--)
            if (num1 % i == 0 && num2 % i == 0) return i;
        return i;
    }

    //【递归求最大公约数】
    public static int gcdmethod2(int num1, int num2) {

        if (num2 == 0) return num1;
        else return gcdmethod2(num2, num1 % num2);
    }

}
