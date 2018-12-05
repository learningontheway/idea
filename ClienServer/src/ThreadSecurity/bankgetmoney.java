package ThreadSecurity;

/*
提供一个取钱的线程类
1）提供了Account类的account属性和double类的取款额的属性
2）提供带线程名的构造方法
3）run()方法中提供取钱的操作
3.在主类中创建线程进行测试。考虑线程安全问题。
 */

class MyThread implements Runnable{
    Account account;

    public  void run(){
     //   synchronized (account) {
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName() +"   :   " +i);
            }
     //   }
}



        }

public class bankgetmoney {
    public static  void main(String[] args){
        MyThread myThread=new MyThread();
        Thread td1=new Thread(myThread);
        Thread td2=new Thread(myThread);
        td1.start();
        td2.start();

    }
}
