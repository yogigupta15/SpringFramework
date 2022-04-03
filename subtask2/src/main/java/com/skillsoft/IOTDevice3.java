package com.skillsoft;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IOTDevice3 {
    String device;
    String description;
    public IOTDevice3(){
        System.out.println("object is created!");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {

        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "IOTDevice {" +
                "device = '" + device + " !\' " + ",description ='" + description + "\'" + '}';

    }
    @PostConstruct
    public void initBean() throws Exception{
        System.out.println("inside init");

    }
    @PreDestroy
    public void destroyBean() throws Exception{
        System.out.println("destroy method");
    }

}
