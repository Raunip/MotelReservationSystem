package mainPackage;// insert package name here

public class CheckIn
{
    private int confNum;
    private String customerLastName;

    public CheckIn(int num, String last_name)
    {
        confNum = num;
        customerLastName = last_name;
    }

    public void getReservation()
    {
        // call retrieveResInfo()
    }

    public boolean confirmCheckIn()
    {
        return true; // placeholder
        // function will call retrieveResInfo()?
    }

}