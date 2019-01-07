/** =====================================================================
 *  Authors: Abhishek Kapoor, ChanYoung Cho collaboration project
 *  Date: November 18th, 2018
 *  Attributes: int reps, double sets, int time, String type
 *  Purpose: LinkedList Node class for Inheritance of LinkedList
 ======================================================================*/
import java.util.LinkedList;

public class Node
{
    /**
     LinkedList Node
     */
    public Node nextNode;
    /**
     Object day that increases Linkedlist Node
     */
    private Object Day;


    //method node
    public Node(Object Day)
    {
        this.Day = Day;
        this.nextNode = null;
    }

    //setter for object day
    public void setDay(Object DayInfo)
    {

        this.Day = DayInfo;



    }
    //getter for object day
    public Object getDay()
    {
        return this.Day;

    }


    /**
     Convert to String, return updated node
     */

    public String SetNodetoString()
    {
        return "Today's day, we have the following:" + this.nextNode;

    }

}
