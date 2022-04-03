package com.skillsoft;

public class IOTDevice1 {
    String device;
    String description;
    public String getDevice(){
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
    public String toString(){
        return"IOTDevice {" +
                "device = '" + device + " !\' "  + ",description ='"  + description + "\'" + '}';

    }
}
