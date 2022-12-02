package mainPackage;


import java.time.Month;

public class MyDate
{
    private int Month;
    private int Day;
    private int Year;


    public MyDate()
    {

    }

    public MyDate(int month, int day, int year) {
        Month = month;
        Day = day;
        Year = year;

    }

    public void SetDate(int month, int day, int year)
    {
        Month = SetMonth(month);
        Day = SetDay(day);
        Year = SetYear(year);

    }

    public int GetDate()
    {
        Month = GetMonth();
        Day = GetDay();
        Year = GetYear();
        System.out.println(Month);
        return Month;
    }



    public int SetMonth(int Month)
    {
        this.Month = Month;
        return Month;
    }

    public int SetDay(int day)
    {
        Day = day;
        return day;
    }

    public int SetYear(int year)
    {
        Year = year;
        return year;
    }

    public int GetMonth()
    {
        return Month;
    }

    public int GetDay()
    {
        return Day;
    }

    public int GetYear()
    {
        return Year;
    }
    public static void main(String[] args){
    MyDate date1 = new MyDate(12,14,2022);

        date1.GetDate();
}


}
