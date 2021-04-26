/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclerental;
import java.util.Scanner; 


/**
 *
 * @author sebas
 */
public class VehicleRental {


        
        
    Car audi = new Car("Kennzeichen1", "audi", " A4", 300, 5, 2, 200);
    Car opel = new Car("Kennzeichen2", "Opel", "corsa", 150, 5, 1, 300);
    Car porsche = new Car("Kennzeichen3", "Porsche", "Cayenne", 500, 5, 3, 500);
    
    Trailer smalltrailer1 = new Trailer ("Kennzeichen1", "Hersteller1", "small", false, 50, 3);
    Trailer smalltrailer2 = new Trailer ("Kennzeichen2", "Hersteller1", "small with break", true, 30, 2);
    Trailer bigtrailer1 = new Trailer ("Kennzeichen3", "Hersteller2", "big", false, 20, 5);
    Trailer bigtrailer2 = new Trailer ("Kennzeichen4", "Hersteller2", "big with break", true, 40, 8);
    
        
        public static void main(String[] args) {

    }
        
        public void SelectVehicle(){
            System.out.println("Please select your prefered vehicle: \n"
                    + "please type: \n"
                    + "1 for " + audi.manufactorer + audi.type + "\n"
                    + "2 for " +opel.manufactorer + opel.type + "\n"
                    + "3 for " +porsche.manufactorer + porsche.type + "\n\n"
                            
                    + "4 for "+ smalltrailer1.manufactorer + smalltrailer1.type + "\n"
                    + "5 for "+ smalltrailer2.manufactorer + smalltrailer2.type + "\n"
                    + "6 for "+ bigtrailer1.manufactorer + bigtrailer1.type + "\n"
                    + "7 for "+ bigtrailer1.manufactorer + bigtrailer1.type + "\n");
            
            
        }
        
        int number; 
        
        public void TypeNumber (){
            
            System.out.println("Your Vehicle: \n");
            
            switch (number){
                case 1: 
                    System.out.println(audi.licensePlate);
            }
            
        }

    
}
