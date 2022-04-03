package com.skillsoft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main5 {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        IOTDevice1 myIOTDeviceBean1 = appContext.getBean("myIOTDeviceBean1",IOTDevice1.class);
        IOTDevice1 myIOTDeviceBean2 = appContext.getBean("myIOTDeviceBean2", IOTDevice1.class);

        myIOTDeviceBean1.setDevice("Fridge");
        myIOTDeviceBean1.setDescription("Temperature gauge for the freezer");

        myIOTDeviceBean2.setDevice("Dishwasher");
        myIOTDeviceBean2.setDescription("Monitor water flow");

        System.out.println("My IOTDeviceBean1:\n" + myIOTDeviceBean1);
        System.out.println("My IOTDeviceBean2:\n" + myIOTDeviceBean2);
    }
}
