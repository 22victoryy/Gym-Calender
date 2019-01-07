/** ============================================================
 * Name: Abhishek Kapoor, ChanYoung Cho
 * Date: November 24, 2018
 * This file describes a Month class, which contains various
 * days
 ============================================================*/

public class Month
{
    private Day[] days;
    private int dayCounter = 0;

    public Month(Day[] days)
    {
        this.days = days;
    }

    public void addDay(Day dayToAdd)
    {
        days[dayCounter] = dayToAdd;
        dayCounter++;
    }

    public void removeDay()
    {
        days[--dayCounter] = null;
    }

    public Day removeAndReturnDay()
    {
        Day lastDay = days[--dayCounter];
        removeDay();
        return lastDay;
    }

}
