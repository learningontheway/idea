package Hello;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext atc=new  ClassPathXmlApplicationContext("spring-config.xml");
        helloword hw1=(helloword)atc.getBean("helloword1");
        helloword hw2=(helloword)atc.getBean("helloword2");
        System.out.println(hw1);
        System.out.println(hw2);
        hw1.hello();
        hw2.hello();

    }
}
