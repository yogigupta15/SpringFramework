package com.skillsoft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

        IOTDevice2 myIOTDeviceBean1 = (IOTDevice2) applicationContext.getBean("myIOTDeviceBean1");

        IOTDevice2 myIOTDeviceBean2 = (IOTDevice2) applicationContext.getBean("myIOTDeviceBean2");

        myIOTDeviceBean1.setDevice("Fridge");
        myIOTDeviceBean1.setDescription("Temperature gauge");

        myIOTDeviceBean2.setDevice("Dishwasher");
        myIOTDeviceBean2.setDescription("Monitor");

        System.out.println(myIOTDeviceBean1);
        System.out.println(myIOTDeviceBean2);

        applicationContext.close();
    }

}

