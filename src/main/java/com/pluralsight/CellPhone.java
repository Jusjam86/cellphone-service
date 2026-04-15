package com.pluralsight;

public class CellPhone {

    // Instance variables
    private String name = "";
    private String phoneNumber = "";
    private String carrier = "";
    private String model = "";
    private int serialNumber = 0;


    // getters allow read access to a variable
    public String getName() {
        return name;
    }
    // setters allow to write access to a variable
    public void setName(String name){
        this.name = name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getCarrier(){
        return carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    // Dial method
    public void dialNumber(String numberToDial){
        System.out.println(this.name + " is calling " + numberToDial);
    }

}
