package mainPackage;

import java.util.GregorianCalendar;

public class StayInfo
{
    //private MyDate checkInDate;
    private GregorianCalendar checkInDate;
    //private MyDate checkOutDate;
    private GregorianCalendar checkOutDate;
    private int stayLength;

    public StayInfo(int In_Month, int In_Day, int In_Year, int Out_Month, int Out_Day, int Out_Year, int length)
    {
       //checkInDate = new MyDate(In_Month, In_Day, In_Year);
        checkInDate = new GregorianCalendar(In_Year, In_Month, In_Day);
       //checkOutDate = new MyDate(Out_Month, Out_Day, Out_Year);
        checkOutDate = new GregorianCalendar(Out_Year, Out_Month, Out_Day);
       stayLength = length;
    }

    public void setCheckInDate(int month, int day, int year)
    {
        //checkInDate.SetDate(month, day, year);
        checkInDate.set(year, month, day);
    }

    //public MyDate getCheckInDate()
    public GregorianCalendar getCheckInDate()
    {
        return checkInDate;
    }

    public void setCheckOutDate(int month, int day, int year)
    {
        //checkOutDate.SetDate(month, day, year);
        checkOutDate.set(year, month, day);
    }

    //public MyDate getCheckOutDate()
    public GregorianCalendar getCheckOutDate()
    {
        return checkOutDate;
    }

    public int getStayLength()
    {
        return stayLength;
    }

    public void setStayLength(int length)
    {
        stayLength = length;
    }
}
