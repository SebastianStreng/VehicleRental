package vehiclerental;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Car extends Vehicle{
    
    int horsePower; 
    int seats; 
    int sizecategory; 
    int dailyRate; 
    
    public Car(String licensePlate, String manufactorer, String type, int horsePower, int seats, int sizecategory, int dailyRate) {
        super(licensePlate, manufactorer, type);
    }
    public double GetCarPrice(int dailyRate){
        return dailyRate; 
    }
}
