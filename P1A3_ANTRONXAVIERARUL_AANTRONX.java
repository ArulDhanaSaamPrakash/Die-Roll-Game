/*
*author = Arul Dhana Saam prakash Antron Xavier Arul
*Original creation Date=06/10/2017
*Last Modified Date=06/10/2017
*Description=
*1. This program would ask for the user to enter his name initially.
*2. Next, it would display a welcome message to the user.
*3. Next, it would display the Description of the 4-die role game and instructions for the game.
*4. Next, it would promt the user to either press 1 to play the game manually or press 2 to make the computet play with itself or press any other number to quit the game..
*5. If the user has pressed 1 and chosen to play manually.The program would promt the user to press "enter key" to start playing the game.
*5. Next, it would ask the user to press "enter key" for every die throw.
*6. Next, based on the value that has been shown up during the dice throw, the program would determine whether the user has won the game or not.
*7. Next, It would display message to the user of the game in the console stating whether he/she has won the game or not.
*8. Step 4 will be repeated again.
*9. Now, lets say the user has pressed 2,to make the computer to play with itself.
*10. Next,the program would ask the user "How many games does he/she wants the computer to play with itself"
*11. Based on the user's input, the program would play that many number of games with itself.
*12. Finally, the program would display the summarized results of the computer's games against itsef.
*13. Steps 4-12 will keep on repeating until the user presses any number other than 1 and 2 to quit the program.
*/
import java.io.IOException;
import java.util.Scanner;
public class P1A3_ANTRONXAVIERARUL_AANTRONX {
  //This method displays a welcome message to the user.
  //It also displays a brief Description about the game.
  //Finally, it would display the instructions/rules of the game.
     public static void welcome(String name)
    {
        System.out.println("welcome to the 4 die roll game : "+name);
        System.out.println("I am A.Arul Dhana Saam Prakash who is the creator of the 4 die roll game.");
        System.out.println("\nDescription about the game:\nIts an very simple and interesting game. "
                + "You will be given 4 dice and asked to roll...\n"
                + "Based on the outcome of the die you will be determined as either you have won the game or lost the game. ");
        System.out.println("\nMoving on, Let me tell you about the rules of the game that you are about to play...\n");
        System.out.println("A new player begins with his first dice roll (4 die = 1 set of dice). This is known as the \"starting roll.\"\n" +
                            "If the player rolls a 6, 12, 18, or 24 the player wins.\n" +
                            "If the player rolls a 9, 11, 17, 19, or 23 the player loses.\n" +
                            "If the player rolls any other number, the \"starting roll\" becomes the \"goal number.\"\n" +
                            "The player must continue to roll the dice until either one of two things happens:\n" +
                            "The player rolls an 11, and he loses.\n" +
                            "The player rolls the \"goal number\" again, and he wins."
                + "\n\nKindly take a minute to read the above instructions...\n");
    }
    //This method simulate the 4 die roll game.
    // This method takes 4 die objects as input and a boolean flag varible that represents whether the game is playd by user or the computer.
    //if the computerModeFlag is true. Computer is playing the game or else user is playing the game.
    //Lets say the user is playing the game.
    //1.It rolls 4 die together and stores the dice value that has showed up as the starting roll.
    //2.During the first roll of  dice, it checks whether the startingRoll value has been equal to 6 or 12 or 18 or 24.
    //3.If the startingRoll value matches with the value mentioned above it displays a message to the user stating that he/she has won the game and terminates itself.
    //4.If the startingRoll value doesnt match with the value mentioned above , it checks whether the starting roll value is equal to 9 or 11 pr 17 or 19 or 23.
    //5. If the startingRoll value matches with the value mentioned above it displays a message to the user stating that he/she has lost the game and terminates itself.
    //6. else, it assigns the goal number vaue to be equal to the startingRoll's value.
    //7. Next, it would ask the user to "press enter key" to roll the die again.
    //8. Now, if the diceRollValue is equal to the goal number , it would display a message to the user stating that he/she has won the game and terminates itself.
    //9. Else it checks whether the diceRollValue is equal to 11. If so it dispalys a mesage to the user stating that he/she has lost the game and terminates itself.
    //10. Else, it would ask the user to "press enter key" to roll the die again.
    //11.Now, it would roll 4 die together and stores the dice value that has showed up as the diceRollValue.
    //11. Steps 8-11 continues until the user has either won the game or lost the game.
    //On the other hand, when the computer is palying is game. Steps 1-11 will be repeated except the fact that the computer will not be prompted to "press enter key" for every die throw.
     public static boolean startGame(boolean computerModeFlag,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject1,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject2,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject3,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject4) throws IOException
     {
       int startingRoll; //This variable is used to store the starting Roll value i.e the value that shows up when dice is thrown for the first time.
       int goalNumber =0; // This variable is used to store the goal number.
       int diceRollValue; // This variable keeps tracks of the dice value.
       int rollNumber=0; // This variable keeps track of the number of times dice has been thrown.
        startingRoll=diceRole(dieObject1,dieObject2,dieObject3,dieObject4);
        rollNumber++;
        diceRollValue=startingRoll;
        while(true)// It an infinite loop. Loop can terminate only if the user has either won or lost the game.
        {
            if(rollNumber==1) // Checking if the dice is rolled for the first time or not.
            {
                System.out.println("***********************************************");
                System.out.println("Your dice Value is: "+startingRoll+"\nCount of times you have rolled your dice so far :"+rollNumber);
                    if(startingRoll==6 || startingRoll==12 || startingRoll==18 || startingRoll==24)
                    {
                    System.out.println("You have won the game...");
                     System.out.println("***********************************************");
                    return true;
                    }
                    else if(startingRoll==9  || startingRoll==11 || startingRoll==17 || startingRoll==19 || startingRoll==23)
                    {
                    System.out.println("Sorry..You have lost the game..");
                     System.out.println("***********************************************");
                    return false;
                    }
                    else
                    {
                       goalNumber=startingRoll;
                        System.out.println("***********************************************");
                        if(computerModeFlag!=true)// Checking whether the game is played by computer or by the user
                        {
                            System.out.println("Press enter to roll the dice again...");
                            int enterKeyPressed=System.in.read(new byte[2]);
                        }
                    }
            }
            else
            {
                 System.out.println("***********************************************");
                System.out.println("\nYour goalNumber you are trying to achieve to win the game is :"+goalNumber+"\n"
                        + "Your dice Value is: "+diceRollValue
                        + "\nCount of times you have rolled your dice so far (Including current dice throw is) :"+rollNumber);
                if(diceRollValue==goalNumber)
                {
                System.out.println("You have won the game...");
                 System.out.println("***********************************************");
                return true;
                }
                else if(diceRollValue==11)
                {
                System.out.println("Sorry..You have lost the game..");
                 System.out.println("***********************************************");
                return false;
                }
                else
                {
                       System.out.println("***********************************************");
                       if(computerModeFlag!=true) // Checking whether the game is played by computer or by the user
                       {
                         System.out.println("Press enter to roll the dice again...");
                         int enterKeyPressed=System.in.read(new byte[2]);
                       }

                }
            }
               diceRollValue=diceRole(dieObject1,dieObject2,dieObject3,dieObject4);// Rolling the dice again.
               rollNumber++;// Incrementing the count of times the dice has thrown.
        }
    }
    //This method calculates the dice Value that has been showed up during a throw.
    //It takes in 4 die objects as input argument and throws them to calculate the die value.
     public static int diceRole(P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject1,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject2,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject3,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject4)
    {
            int diceValue=0;
            diceValue+=dieObject1.dieRoll(); // Throwing die 1.
            diceValue+=dieObject2.dieRoll(); // Throwing die 2.
            diceValue+=dieObject3.dieRoll(); // Throwing die 3.
            diceValue+=dieObject4.dieRoll(); // Throwing die 4.

        return diceValue; // returning the dice value
    }

    //This method is reponsible for displaying the results when the computer played games against itself.
    //This method takes in 4 die objects as input argument and the num of times the computer wants to play with itself as another input argument.
    //1.This method has an bollean array called compterGameresults which keeps tracks of whether the computer has won the game or not.
    //2.It also keeps track of total number of games won by the computer and the total number of games lost by the computer.
    //3.Finally, it displays the summary results of all the games played by the computer.
     public static void computerPlayWithItself(int noOfTimesComputerPlaysWithItself,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject1,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject2,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject3,P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject4) throws IOException
     {
      boolean compterWonTheGame=false;
                boolean[] compterGameresults=new boolean[noOfTimesComputerPlaysWithItself]; //Boolean array to keep track of computer's game results.
                int numberOfGamesComputerWon=0;//This varible keeps track of total number olf games won by the computer.
                int numberOfGamesCompterLost=0;//This varible keeps track of total number olf games Lost by the computer.
                for(int counter=0;counter<noOfTimesComputerPlaysWithItself;counter++)
                {
                    System.out.println("\n\n****************Game Number: "+(counter+1)+"******************");
                  compterWonTheGame=startGame(true,dieObject1,dieObject2,dieObject3,dieObject4); //Computer playing game against itself
                  compterGameresults[counter]=compterWonTheGame;
                  if(compterWonTheGame)
                  {
                     numberOfGamesComputerWon++;
                  }
                  else
                  {
                      numberOfGamesCompterLost++;
                  }
                }
                System.out.println("\n\n***********Summary of the results************\n");
                for(int counter=0;counter<noOfTimesComputerPlaysWithItself;counter++)//Printing the summarized results of the games played by the computer.
                {
                    if(compterGameresults[counter])
                    {
                        System.out.println("In Game "+(counter+1)+" computer has"+" Won");
                    }
                    else
                    {
                         System.out.println("In Game "+(counter+1)+" computer has"+" Lost");
                    }
                }
                System.out.println("*******************************************");
                System.out.println("Total Number of games Computer has won: "+numberOfGamesComputerWon);
                System.out.println("Total Number of games Computer has Lost: "+numberOfGamesCompterLost);
                System.out.println("*******************************************");
     }
    public static void main(String[] arul) throws IOException
    {
        int userChoice=0; // This variable keeps track of user's choice.
        String playerName; // This variable is used to store the user's name.
        int noOfTimesComputerPlaysWithItself; // This variable keeps track of number of times the computer wants to play games with itself.
        P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject1=new P1A3_DIE_ANTRONXAVIERARUL_AANTRONX(6,5,"red"); // Die has been created which has 6 sides and it is red in color.
        P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject2=new P1A3_DIE_ANTRONXAVIERARUL_AANTRONX(6,4,"blue");// Die has been created which has 6 sides and it is blue in color.
        P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject3=new P1A3_DIE_ANTRONXAVIERARUL_AANTRONX(6,6,"white");// Die has been created which has 6 sides and it is white in color.
        P1A3_DIE_ANTRONXAVIERARUL_AANTRONX dieObject4=new P1A3_DIE_ANTRONXAVIERARUL_AANTRONX(6,1,"black");// Die has been created which has 6 sides and it is black in color.
        Scanner input=new Scanner(System.in); // Scanner class object is created to get input from the user.
        System.out.println("Please enter your name and press enter key to continue....");
        playerName=input.nextLine();
        welcome(playerName);
        while(true) // Infinite Loop which will terminate only if the user entered a number other than 1 or 2.
        {
            System.out.println("\n\nPress 1.To play the game manually\n"
                    + "Press 2. To make the computer Play with Itself\n"
                    + "Press any other number and then press enter to exit the game...\n");
           userChoice=input.nextInt();
            if(userChoice==2)
            {
                System.out.println("\nPlease enter the number of times you want the computer to play with itself...");
                noOfTimesComputerPlaysWithItself=input.nextInt();
                computerPlayWithItself(noOfTimesComputerPlaysWithItself,dieObject1,dieObject2,dieObject3,dieObject4);
            }
            else if(userChoice==1)
            {
                System.out.println("Press enter key to throw your dice...");
                int enterKeyboardPress=System.in.read(new byte[2]);
                boolean gameStatus = startGame(false,dieObject1,dieObject2,dieObject3,dieObject4);
            }
            else
            {
                System.exit(0); // Terminating the program.
            }
        }
    }
}
