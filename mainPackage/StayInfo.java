package mainPackage;

public class StayInfo
{
    private MyDate checkInDate;
    private MyDate checkOutDate;
    private int stayLength;

    public StayInfo(int In_Month, int In_Day, int In_Year, int Out_Month, int Out_Day, int Out_Year, int length)
    {
       checkInDate = new MyDate(In_Month, In_Day, In_Year);
       checkOutDate = new MyDate(Out_Month, Out_Day, Out_Year);
       stayLength = length;
    }

    public void setCheckInDate(int month, int day, int year)
    {
        checkInDate.SetDate(month, day, year);
    }

    public MyDate getCheckInDate()
    {
        return checkInDate;
    }

    public void setCheckOutDate(int month, int day, int year)
    {
        checkOutDate.SetDate(month, day, year);
    }

    public MyDate getCheckOutDate()
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
