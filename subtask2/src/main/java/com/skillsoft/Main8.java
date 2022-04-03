package com.skillsoft;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main8 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");

        IOTDevice4 myIOTDeviceBean1 = (IOTDevice4) applicationContext.getBean("myIOTDeviceBean1");

        IOTDevice4 myIOTDeviceBean2 = (IOTDevice4) applicationContext.getBean("myIOTDeviceBean2");

        System.out.println(myIOTDeviceBean1);
        System.out.println(myIOTDeviceBean2);

        applicationContext.close();
    }
}
