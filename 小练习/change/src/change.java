

/*
3、【数制转换威力加强版】编写一个应用程序，以表格形式打印1~256之间的各个十进制数及其对等的二进制、八进制和十六进制数。
 */

public class change {
    public static void main(String[] args)
    {
        int i;
        System.out.print("十进制数    "+"二进制数  "+"8进制数 "+"16进制数         "+"\n");
        for(i=1;i<257;i++)
        {
            tentotwo(i);
            tentoeight(i);
            tentosixteen(i);

        }
    }
    //十进制转二进制
    public  static void  tentotwo(int i)
    {
        System.out.print(i+"         ");
        String num="";
        while(i!=0)
        {
            num=num+i%2;                                                                    //num保存相除后的余数
            i=i/2;                                                                          //i保存除后的商，之后的8，16进制里的num，i同义

        }
        ;
        System.out.print(new StringBuffer(num).reverse().toString()+"         ");             //上述保存的num值是倒序的，因此需要num的字符反转
    }

    //十进制转8进制
    public  static void  tentoeight(int i)
    {
        String num="";
        while(i!=0)
        {
            num=num+i%8;
            i=i/8;

        }
        System.out.print( new StringBuffer(num).reverse().toString()+"         ");             //num的字符反转
    }

    //十进制转16进制
    public  static void  tentosixteen(int i)
    {
        String num="";
        while(i!=0)
        {
            switch (i%16)                       //对于16进制来说，余数会大于10，故用相应的字符保存大于9的数字
            {
                case 10:
                    {
                        num=num+"A";
                        break;
                    }
                case 11:
                    {
                        num=num+"B";
                        break;
                    }
                case 12:
                    {
                        num=num+"C";
                        break;
                    }
                case 13:
                    {
                        num=num+"D";
                        break;
                    }
                case 14:
                    {
                        num=num+"E";
                        break;
                    }
                case 15:
                {
                    num=num+"F";
                    break;
                }
                default:num=num+i%16;
            }
            i=i/16;

        }
        System.out.println( new StringBuffer(num).reverse().toString());             //num的字符反转
    }


}
