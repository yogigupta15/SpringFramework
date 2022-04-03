package com.skillsoft;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main7 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

        IOTDevice3 myIOTDeviceBean1 = (IOTDevice3) applicationContext.getBean("myIOTDeviceBean1");

        IOTDevice3 myIOTDeviceBean2 = (IOTDevice3) applicationContext.getBean("myIOTDeviceBean2");

        System.out.println(myIOTDeviceBean1);
        System.out.println(myIOTDeviceBean2);

        applicationContext.close();
    }
}
