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
public class Trailer extends Vehicle {
    
    boolean carbreak; 
    int hourlyRate; 
    int hours; 
    
    
    public Trailer(String licensePlate, String manufactorer, String type, boolean carbreak, int hourlyRate, int hours) {
        super(licensePlate, manufactorer, type);
    }
    
    public int GetTrailerPrice(int hourlyRate, int hours){
        hourlyRate = hourlyRate * hours + 15; 
        return hourlyRate; 
    }
}
