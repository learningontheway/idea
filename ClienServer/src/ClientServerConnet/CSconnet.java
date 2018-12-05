
package ClientServerConnet;

/*
客户端发送图片，服务器端接收图片
 */
import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CSconnet {

    //这是一个客户端
    @Test
    public void Client(){
        Socket ss=null;
        OutputStream os=null;
        FileInputStream fis=null;


        try {
            //1.创建socket对象
            ss=new Socket(InetAddress.getByName("127.0.0.1"),9108);

            //2.从本地获取一个文件发送给服务器
            os=ss.getOutputStream();
            fis =new FileInputStream(new File("1.jpg"));
            byte[] b=new byte[1024];
            int len;
            while((len = fis.read(b))!=-1){

                        os.write(b,0,len);

            }


        ss.shutdownOutput();

    } catch (IOException e) {
        e.printStackTrace();
    }
    //3.接收来自服务器的消息
        try {
            InputStream is = ss.getInputStream();

            byte[] c=new byte[1024];
            int len1;
            while((len1 = is.read(c))!=-1){
                String str = new String(c,0,len1);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ss.close();
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
            ss=new ServerSocket(9108);
            s=ss.accept();

            //2.将从客户端接收的数据保存到本地
            is=s.getInputStream();
            fos=new FileOutputStream(new File("2.jpg"));


            byte[] b1=new byte[1024];
            int len;
            while((len=is.read(b1))!=-1){
                fos.write(b1,0,len);
            }

            //3.反馈接收正确的信息
            System.out.println("收到来自于" + s.getInetAddress().getLocalHost() + "的文件");
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
