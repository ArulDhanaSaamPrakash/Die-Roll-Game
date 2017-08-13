/*
*author = Arul Dhana Saam prakash Antron Xavier Arul
*Original creation Date=06/10/2017
*Last Modified Date=06/10/2017
*Description=
*1.This program stores the informaion about the die.
*2. It also has accessors and mutators methods to manipulate the information about the die.
*3. It also has a method called dieRoll() which would simulate the action : "rolling of a die" as per the real world.
*/
public class P1A3_DIE_ANTRONXAVIERARUL_AANTRONX {
    private int numberOfSides;//This variable is used to store the number of sides a die has.
    private int currentValue; //This variable is used to store the currentValue that has been shown up during a die throw.
    private String color; //This variable is used to store the color of a die.
    static int numberOfInstances; //This Variable is used to keep track of the total number of die present in a game.
    //Its a default constructor method which increments the count of the die.
    P1A3_DIE_ANTRONXAVIERARUL_AANTRONX()
    {
       numberOfInstances++; //
    }
    //This method is a parameterized constructor method.
    //This method initializes the information of a die like numberOfSides a die has,currentValue of a die, color of a die.
    //This method also increments the count of the die to keep track of the total number of die present in the game.
    P1A3_DIE_ANTRONXAVIERARUL_AANTRONX(int numberOfSides,int currentValue,String color)
    {
       this.numberOfSides= numberOfSides;
       this.currentValue=currentValue;
       this.color=color;
       numberOfInstances++;
    }
    //This method simulates the die throw action.
    //It creates a random number between 1-6 and assigns it to be the die's value.
    public int dieRoll()
    {
    currentValue = (int) (Math.random() * ( numberOfSides ))+1; // Math.random() function has been used here to generate a random rumber.
    //Also, here numberOfSides represents the maximum range upto which random number can be generaed.
    return currentValue;
    }
    //This method returns the number Of Sides a die has.
    public int getNumberOfSides() {
        return numberOfSides;
    }
    //This methid sets the number of sides a die has.
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    //This method retuns the current value of a die.
    public int getCurrentValue() {
        return currentValue;
    }
    //This method sets the current value of a die.
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
    //This method gets the color of the die and returns it.
    public String getColor() {
        return color;
    }
    //This method sets the color of the die.
    public void setColor(String color) {
        this.color = color;
    }
    //This method returns the total number die that are present.
    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}
