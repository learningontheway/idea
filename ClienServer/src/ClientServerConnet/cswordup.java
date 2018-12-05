package ClientServerConnet;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

/*
客户端给服务端发送文本，服务端会将文本转成大写在返回给客户端。

 */
public class cswordup {

    private int i;

    @Test
    public void Client() throws Exception{
        FileInputStream fileInputStream=new FileInputStream(new File("1.txt"));
        Socket s=new Socket(InetAddress.getByName("127.0.0.1"),9008);
        OutputStream fileOutputStream=s.getOutputStream();
        byte[] b=new byte[1024];
        int len;
        while((len=fileInputStream.read(b))!=-1){
            fileOutputStream.write(b,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
        s.close();


    }
    @Test
    public void test(){
        int num[] = {1,2,3,4,5,6,7,8};
        String str="123456";
        System.out.println(parseInt(str));
        i = num[1];
        System.out.println(valueOf(i));
      //  System.out.println(str.getBytes().);

    }
    @Test
    public void Server() throws Exception{
        ServerSocket ss=new ServerSocket(9008);
        Socket s=ss.accept();

        InputStream is=s.getInputStream();
        FileOutputStream fileOutputStream=new FileOutputStream(new File("2.txt"));

        byte[] b=new byte[1024];

        int len;
        while((len=is.read(b))!=-1){

            String str = new String(b,0,len);
           fileOutputStream.write(str.toUpperCase().getBytes(),0,len);

           //注意再各种流中，都是使用字节数组进行数据传输
            /*
            String str = new String(b,0,len);   字节数组转换为字符串
            getBytes()                          字符串转换为字节数组
             */
        }
        is.close();
        fileOutputStream.close();
        s.close();


    }
}
