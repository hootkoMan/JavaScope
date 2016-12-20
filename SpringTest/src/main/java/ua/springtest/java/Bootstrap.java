package ua.springtest.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ruslan.
 */
public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

//        Bootstrap bootstrap1 = (Bootstrap) applicationContext.getBean("bootstrap");

        // не поймет какой бин
//        Bootstrap bootstrap2 = applicationContext.getBean(Bootstrap.class);

        Bootstrap bootstrap3 = applicationContext.getBean("bootstrap2", Bootstrap.class);

        bootstrap3.print();

    }

    public void print() {
        System.out.println("Hello");
    }
}
