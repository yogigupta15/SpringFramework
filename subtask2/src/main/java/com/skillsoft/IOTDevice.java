package com.skillsoft;

public class IOTDevice {
    String device = "Air Conditioner";
    String description = "Temperature sensor";
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
