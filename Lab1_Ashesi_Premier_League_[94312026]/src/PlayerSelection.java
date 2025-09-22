//Adansie Boahene
//94312026
//OOP Lab 01
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args){
        // Declare variables to hold player details
        String name;
        int age;
        float height;  // in meters
        float weight; // in pounds
        int jerseyNumber;
        String category;
        String position;
        String lineupDecision;
        String eligibility;

        // Create Scanner object for input
        Scanner input= new Scanner(System.in);
        System.out.println("Kindly enter the player's name: ");
        name=input.nextLine();

        // Collect player details from the user
        System.out.println("Kindly enter the player's age: ");
        age=input.nextInt();

        System.out.println("Kindly enter the player's height: ");
        height=input.nextFloat();
        
        System.out.println("Kindly enter the player's weight: ");
        weight=input.nextFloat();

        System.out.println("Kindly enter the player's jersey number: ");
        jerseyNumber=input.nextInt();

        input.close();

         // Conversion constants
        final float POUND=0.45359237f;
        final float METER=100.0f;

        // Convert height from meters to centimeters
        height= METER*height;

        // Convert weight from pounds to kilograms and cast to int (round down)
        int Weight= (int) (weight/POUND);

    
        age++;
        jerseyNumber--;
       
        // Eligibility check: 18 <= age <= 35 and weight < 90kg
        if(age>=18 && age<=35 && Weight<90){
            eligibility="Eligible";
            System.out.println(eligibility);

            }

        else{
            eligibility="Not Eligible";
            System.out.println(eligibility);
            if(age<18 || Weight>90){
                System.out.println("Player has a problem (either too young or too heavy)");
            }
        }

        
        if(age>=18 && age<20){
            category="Rising star";
        }
        else if(age>=20 && age<=30){
            category="Prime player";
            if(Weight<80){
                lineupDecision="Starting lineup";
            }
            else{
                lineupDecision="bench"; 
            }
        }

        else{
            category="Veteran";
        }
       
        switch(jerseyNumber){
            case 1:
                position="Goalkeeper";
                break;
            case 2:
            case 5:
                position="defender";
                break;
            case 6:
            case 8:
                position="midfielder";
                break;
            case 7:
            case 11:
                position="Winger";
                break;
            case 9:
                position="Striker";
                break;
            case 10:
                position="Playmaker";
                break;
            default:
                position="Player position not known";        
        }
        
        //player report output
        System.out.println("Below is the Player Report:");
        System.out.println("Player: ["+name+"]");
        System.out.println("Age: ["+age+"] (["+category+"])");
        System.out.println("Height: ["+height+"cm]");
        System.out.println("Weight: ["+Weight+"kg]");
        System.out.println("Jersey: ["+jerseyNumber+"]");
        System.out.println("Position: ["+position+"]");
        System.out.print("Attacker jersey: [");
        if(jerseyNumber==7||jerseyNumber==9||jerseyNumber==10||jerseyNumber==11){
            System.out.println("Yes]");
        }
        else{
            System.out.println("No]");
        }
        System.out.println("Eligibility: ["+eligibility+"]");
       // System.out.println("Lineup Decision: ["+lineupDecision+"]");
        System.out.print("Final decision: [");
        if(eligibility.equals("Eligible")){
            System.out.println("Play]");
        }
        else{
            System.out.println("Rest]");
        }

        }
        
        }


