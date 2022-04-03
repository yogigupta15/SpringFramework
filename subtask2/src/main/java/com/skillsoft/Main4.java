package com.skillsoft;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main4 {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        IOTDevice1 myIOTDeviceBean1 = (IOTDevice1) appContext.getBean("myIOTDeviceBean1");

        myIOTDeviceBean1.setDevice("Fridge");
        myIOTDeviceBean1.setDescription("Temperature gauge for the freezer");

        System.out.println("ApplicationContext cast to BeanFactory:\n" + myIOTDeviceBean1);

    }
}
