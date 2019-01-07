/* =========================================================
Name: ClientCode for Gym
Date: December 22, 2018
Author: Abhishek Kapoor and ChanYoung Cho
Purpose: The ClientCode uses the Day and Month classes
 ========================================================== */
import java.util.Scanner;

public class ClientCode
{

    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("What activity are you doing?");
        String type = myScan.nextLine();

        while (type.equals(""))
        {
            System.out.println("Invalid Activity. Please Enter the Correct Activity.");
            type = myScan.nextLine();
        }

        if(type.equals("Cardio") || type.equals("cardio"))
        {
            System.out.println("Sets and Reps will be nullified.");

            Activity myActivity = new Activity();
            myActivity.setSets(-1);
            myActivity.setReps(-1);
            myActivity.setType("cardio");

            myActivity.get_duration_activity();
            System.out.println(myActivity);

        }
        else if (type.equals("Weights") || type.equals("weights"))
        {
            Activity myActivity = new Activity();

            try
            {
                myActivity.get_num_reps();
                myActivity.setSets(myActivity.getReps() * 0.1);
                myActivity.setType("weights");
            }
            catch(NumberFormatException e)
            {
                e.printStackTrace();
            }
            System.out.println(myActivity);
        }
        else
            System.out.println("Invalid Activity type. Please enter either Weights or Cardio.");
    }

}
