
package ClientServerConnet;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//TCP编程例三：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
//如下的程序，处理异常时，要使用try-catch-finally!!本例仅为了书写方便~
public class CS {
    @Test
    public void client()throws Exception{
        //1.创建Socket的对象
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9898);
        //2.从本地获取一个文件发送给服务端
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("1.jpg"));
        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){
            os.write(b,0,len);
        }
        socket.shutdownOutput();
        //3.接收来自于服务端的信息
        InputStream is = socket.getInputStream();
        byte[] b1 = new byte[1024];
        int len1;
        while((len1 = is.read(b1)) != -1){
            String str = new String(b1,0,len1);
            System.out.print(str);
        }
        //4.关闭相应的流和Socket对象
        is.close();
        os.close();
        fis.close();
        socket.close();
    }
    @Test
    public void server() throws Exception{
        //1.创建一个ServerSocket的对象
        ServerSocket ss = new ServerSocket(9898);
        //2.调用其accept()方法，返回一个Socket的对象
        Socket s = ss.accept();
        //3.将从客户端发送来的信息保存到本地
        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("3.jpg"));
        byte[] b = new byte[1024];
        int len;
        while((len = is.read(b)) != -1){
            fos.write(b, 0, len);
        }
        System.out.println("收到来自于" + s.getInetAddress().getHostAddress() + "的文件");
        //4.发送"接收成功"的信息反馈给客户端
        OutputStream os = s.getOutputStream();
        os.write("你发送的图片我已接收成功！".getBytes());
        //5.关闭相应的流和Socket及ServerSocket的对象
        os.close();
        fos.close();
        is.close();
        s.close();
        ss.close();
    }
}

/*
package ClientServerConnet;


import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CS {

    //这是一个客户端
    @Test
    public void Client(){
        Socket socket;
        OutputStream os=null;
        FileInputStream fis=null;

        try {

            //1.创建socket对象
            socket=new Socket(InetAddress.getByName("127.0.0.1"),9008);

            //2.从本地获取一个文件发送给服务器
            os=socket.getOutputStream();
            fis =new FileInputStream(new File("1.jpg"));
            byte[] b=new byte[1024*1024];
            int len;
            if((len=fis.read(b))!=-1){
                    try {
                        os.write(b,0,len);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        //3.接收来自服务器的消息
        InputStream inputStream=socket,getInputStream;
        byte[] b=new byte[1024];
        int len;
        if((len=fis.read(b))!=-1){

        }


import org.junit.Test;try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    //这是一个服务器端
    @Test
    public void Server(){
        ServerSocket ss=null;
        Socket s=null;
        InputStream is=null;
        FileOutputStream fos=null;
        OutputStream os=null;
        try {
            //1.创建一个serverSocket的对象，并用其进行数据的接收
            ss=new ServerSocket(9008);
            s=ss.accept();

            //2.将从客户端接收的数据保存到本地
            is=s.getInputStream();
            fos=new FileOutputStream(new File("2.jpg"));

            //这个程序是有问题的，只交互了一次，所以再byte[1024]的时候，图片值传输成功了一部分
            byte[] b=new byte[1024*1024];
            int len;
            if((len=is.read(b))!=-1){
                fos.write(b,0,len);
            }

            //3.发聩接收正确的信息
            os=s.getOutputStream();
            os.write("图片已经正确接收".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭相应的流
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
*/