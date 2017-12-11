

package jackson.coma;

import java.awt.Color;
import java.util.Scanner;

/******************************************************
***  Class Name
***  Eric Jackson
******************************************************
*** Purpose of the class (Why did you write this class?)
***
******************************************************
*** Date
******************************************************
*** List of changes with dates. 
******************************************************
*** Look at this!
*** List all the places in the code where you did something interesting,
*** clever or elegant.  If you did good work in this program and you want
*** me to consider it in your grade, point it out here.
*******************************************************/
public class JacksonComa {

    Car myCar;
public class Car {
    // Holds make.
    private String make;
    // Holds model.
    private String model;
    // Holds color.
    private Color color;
    // Holds speed
    private int speed;
    
    // Constructor, accepts make, model and color as parameters.
    public Car(String make, String model, Color color){
        // set the arguments to the member variables.
        this.make = make;
        this.model = model;
        this.color = color;
        // the default speed will be 0 since the car isn't moving.
        speed = 0;
    }
    
    // ##############################################################
    // SETTERS
    // THESE METHODS WILL SET CAR MEMBER VARIABLES TO THOSE OF THE USER.
    // ##############################################################
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(Color color){
        this.color = color;
    }
    
    // ##############################################################
    // GETTERS
    // THESE METHODS SIMPLY RETURN A VALUE TO THE USER.
    // ##############################################################
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public Color getColor(){
        return color;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    // these are super short methods which is why they don't need heavy
    // documentations
    
    // ################################################################
    // Method Name: accelerate
    // Purpose: this method simply increments the speed by 5.
    // Return type: void
    // ################################################################
    public void accelerate(){
        speed += 5;
    }
    
    // ################################################################
    // Method Name: brake
    // Purpose: this method simply decrements the speed by 5 and if speed is 0
    // it sets the speed to 0. can't make the speed negetive.
    // Return type: void
    // ################################################################
    public void brake(){
        if (speed <= 0){
            speed = 0;
        }
        else{
            speed -= 5;
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }

}
