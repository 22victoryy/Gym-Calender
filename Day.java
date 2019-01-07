import java.util.Scanner;
import java.util.ArrayList;


public class Day
{
    /**
     The number of time entered
     */
    private String time;

    /**
     Array of activty appended to lit
     */
    //private Activity[] Activities;

    private ArrayList MyList;

    /**
     Counter for how many activities(?) Not quite sure what this variable was(?)
     */
    //private int counter;


    public void get_time()
    {
     // user inputs time
        Scanner time = new Scanner(System.in);
        this.time = time.nextLine();

        //something has to go here
        //how to assign this.time? String is already assigned.

    }

    public void get_activities()
    {
        // Array of activities is used, use inputs, appended to list
        String answeredEntered = "";
        while (!answeredEntered.equals("No") && !answeredEntered.equals("no"))
        {
            Scanner activities = new Scanner(System.in);
            String ActivitiesEntered = activities.nextLine();
            MyList = new ArrayList<>();
            MyList.add(ActivitiesEntered);
            System.out.println("Enter another activity? Yes or No?");
            answeredEntered = activities.nextLine();
            //How to assign arrays so we can get the string?
        }


    }

    public String set_activity()
    {
        //gets the time from get_time and pick one from get_activiity, print statement saying "We have ____ at time ___"
        return "Today, we have "+ MyList.get(0) + "at" + this.time;
    }







}

