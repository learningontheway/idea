
/*
1.【二叉查找】编写“猜数字”的程序，程序在1到1000的范围内随机选取一个整数作为要猜的数。applet在靠近JTextField的地方显示提示信息“Guess a number between 1 and 1000”。
玩家输入第一次猜测的值，然后按下Enter键。如果没有猜对，程序应该显示“Too high. Try again.”或“Too low. Try again.”。
接着输入下一个猜测值。用户输入正确值之后，程序在状态栏中显示“Congratulations. You guessed the number!”。
注意：这个问题中所用的猜数技术类似于二叉查找
2、修改上题统计玩家的猜测次数。如果次数小于或等于10次，打印“Either you know the secret or you got lucky!”；
如果玩家刚好猜了10次，打印“Aha! You know the secret!”；如果玩家猜了不止10次，打印“You should be able do better!”。
 */

import java.util.Scanner;
import java.util.Random;

public class guessnum {
    public  static void main(String [] args) {

       //flag记录猜测次数

        int flag=0;
        System.out.println("Guess a number between 1 and 1000");


        //num_init作为初始系统随机预设的一个数值

        int num_init = (int) (1000 * Math.random() + 1);
     //   System.out.println(num_init);


        while (true) {
            Scanner input= new Scanner(System.in);
            int num=input.nextInt();

            //num为玩家的输入猜测数字

            if (num > num_init)
                System.out.println("Too high. Try again.");
            else
                if (num < num_init)
                    System.out.println("Too low. Try again.");
                else
                    {
                        System.out.println("Congratulations. You guessed the number!");
                        flag++;
                        break;
                    }
            flag++;

        }

        //判定猜测次数并输出相关内容

        if (flag<10)
            System.out.println("Either you know the secret or you got lucky!");
        else
            if(flag==10)
                System.out.println("Aha! You know the secret!");
            else
                System.out.println("You should be able do better!");

    }

}
