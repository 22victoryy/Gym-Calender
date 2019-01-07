// Abhishek Kapoor, ChanYoung Cho collaboration project
// Date: November 18th, 2018
// attributes:
// time: int, reps: int, sets: int, type: string

/** =====================================================================
 *  Authors: Abhishek Kapoor, ChanYoung Cho collaboration project
 *  Date: November 18th, 2018
 *  Attributes: int reps, double sets, int time, String type
 *  Purpose: This class represents a single Activity in the Calendar
 ======================================================================*/

import java.util.Scanner;

public class Activity
{
    /**
    The number of reps
     */
    private int reps;
    /**
    The number of sets
     */
    private double sets;
    /**
     * The number of hours
     */
    private double time;
    /**
     * The type of this Activity
     */
    private String type;

    /**
     Return the number of reps
     @return reps, an int representing the number of reps
     @thrwos null
     */
    public int getReps()
    {
        return reps;
    }

    /**
     Set the reps attribute of this class to reps
     @param reps, an int representing the number of reps
     @return null
     @throws null
     */

    public void setReps(int reps)
    {
        this.reps = reps;
    }

    /**
     * Return the number of sets
     * @return sets, a double representing the number of sets
     * @throws null
     */

    public double getSets()
    {
        return sets;
    }

    /**
     * Set the number of sets to sets
     * @param sets, a double representing the number of sets
     * @return null
     * @throws null
     */

    public void setSets(double sets)
    {
        this.sets = sets;
    }

    /**
     * Assign the number of rep to the attribute reps
     * @return null
     * @throws null
     */

    public void get_num_reps()
    {
        // Gets the number of reps in one activity.
        //System.out.println("Enter how many reps");
        Scanner reps = new Scanner(System.in);
        System.out.println("Please enter the number of reps: ");
        String repsEntered = reps.nextLine();
        this.reps = Integer.parseInt(repsEntered);
    }

    /**
     Assign the number of sets to the attribute sets
     @return null
     @throws null
     */
    private void get_num_sets()
    {
        // Gets the number of Sets in one activity.
        String new_sets = new Scanner(System.in).nextLine();
        this.sets = Double.parseDouble(new_sets)  * 0.1;
    }

    public void get_duration_activity()
    {
        // Gets the activity duration.

        System.out.println("Please enter time: ");
        int minutes = Integer.parseInt(new Scanner(System.in).nextLine());
        double hours = (double)minutes / 60;
        this.time = hours;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        if(this.type == "weights")
            return "This Activity class has "+this.reps+" reps, so "+this.sets+" sets. The type is "+this.type;
        else if(this.type == "cardio")
            return "This Activity class has "+this.time+" and the type is "+this.type;
        return "neither condition satisfied";
    }

}


